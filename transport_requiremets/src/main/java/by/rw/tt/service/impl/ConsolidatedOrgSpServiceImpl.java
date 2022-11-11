package by.rw.tt.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import by.rw.tt.dao.ConsolidatedOrgDao;
import by.rw.tt.entity.sp.ConsolidatedOrgSP;
import by.rw.tt.service.ConsolidatedOrgSpService;

@Stateless
public class ConsolidatedOrgSpServiceImpl implements ConsolidatedOrgSpService{
	
	@EJB
	private ConsolidatedOrgDao consolidatedOrgDao;

	@Override
	public List<ConsolidatedOrgSP> findAllConsolidatedOrgs() {
		return consolidatedOrgDao.findAllConsolidatedOrgs();
	}

	@Override
	public boolean isUnique(ConsolidatedOrgSP consolidatedOrgSP) {
		return consolidatedOrgDao.isUnique(consolidatedOrgSP);
	}

	@Override
	public void saveConsolidatedOrg(ConsolidatedOrgSP consolidatedOrgSP) {
		consolidatedOrgDao.saveConsolidatedOrg(consolidatedOrgSP);	
	}
	
	
}
