package by.rw.tt.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import by.rw.tt.entity.sp.ConsolidatedOrgSP;
import by.rw.tt.service.ConsolidatedOrgSpService;

@Named("consOrgBean")
@ViewScoped
public class ConsOrgBean implements Serializable {

	private static final long serialVersionUID = 8876545952686713254L;
	@EJB
	private ConsolidatedOrgSpService consolidatedOrgSpService;
	private List<ConsolidatedOrgSP> consOrgList;
	private ConsolidatedOrgSP selectedConsOrg;
	private ConsolidatedOrgSP newConsolidatedOrgSP;

	public List<ConsolidatedOrgSP> getConsOrgList() {
		return consOrgList;
	}

	public void setConsOrgList(List<ConsolidatedOrgSP> consOrgList) {
		this.consOrgList = consOrgList;
	}

	public ConsolidatedOrgSP getSelectedConsOrg() {
		return selectedConsOrg;
	}

	public void setSelectedConsOrg(ConsolidatedOrgSP selectedConsOrg) {
		this.selectedConsOrg = selectedConsOrg;
	}
	

	public ConsolidatedOrgSP getNewConsolidatedOrgSP() {
		return newConsolidatedOrgSP;
	}

	public void setNewConsolidatedOrgSP(ConsolidatedOrgSP newConsolidatedOrgSP) {
		this.newConsolidatedOrgSP = newConsolidatedOrgSP;
	}

	@PostConstruct
	public void findAllConsOrg() {
		setConsOrgList(consolidatedOrgSpService.findAllConsolidatedOrgs());
	}
	
	public void onEdit() {
		
	}
	
	public void onAdd() {
		newConsolidatedOrgSP = new ConsolidatedOrgSP("","","");
	}

	public void onAddSave() {
		if (!newConsolidatedOrgSP.getConsOrgNum().isEmpty() && !newConsolidatedOrgSP.getShortName().isEmpty()) {
			if (consolidatedOrgSpService.isUnique(newConsolidatedOrgSP)) {
				consolidatedOrgSpService.saveConsolidatedOrg(newConsolidatedOrgSP);
				setConsOrgList(consolidatedOrgSpService.findAllConsolidatedOrgs());
//				sortConsOrgList();
//
//				writeConsOrg(newConsolidatedOrgSP, priznakAdd);
				PrimeFaces.current().executeScript("PF('dialogAdd').hide();");
				PrimeFaces.current().ajax().update("form:table");
				PrimeFaces.current().ajax().update("form:dialogAdd");
			} else {
				FacesContext.getCurrentInstance().addMessage("errorAdd",
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ошибка!", "Повторяющиеся значения."));
			}

		} else {
			FacesContext.getCurrentInstance().addMessage("errorAdd",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ошибка!", "Поля должны быть заполнены."));
		}
	}
}
