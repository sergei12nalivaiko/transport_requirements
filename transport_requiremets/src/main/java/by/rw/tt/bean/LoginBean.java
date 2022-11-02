package by.rw.tt.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import by.rw.tt.dao.PersonDao;
import by.rw.tt.entity.expestdb.Armino;
import by.rw.tt.entity.person.Person;
import by.rw.tt.service.ArminoService;



@Named("loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	
	@EJB
	private PersonDao personDao;
	
	@EJB
	private ArminoService arminoService;

	public LoginBean() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		

		System.out.println(username);
		System.out.println(password);
		
		HttpServletRequest request = (HttpServletRequest) (FacesContext.getCurrentInstance().getExternalContext().getRequest());
		
		try {
			request.login(username, password);
			List<Armino> arminos = arminoService.getAllByMesIndex(101);
			System.out.println(arminos);
			System.out.println(arminos.size());
			if (request.isUserInRole("TR")) {
				return "pages/navigationPanel.xhtml?faces-redirect=true";
			} else {
				return logout();
			}
		} catch (ServletException e) {
			e.printStackTrace();
			switch (e.getStackTrace()[0].getMethodName()) {
			case "login": {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Неверно введен логин или пароль."));
				return "login";
			}
		
			default: {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Неизвестная ошибка."));
				return "login";
			}
		}
		
		}
	}

	public String logout() {
		Person person = personDao.selectPersonByID("0000071841");
		System.out.println(person);
//		List<Armino> arminos = arminoService.getAllByMesIndex(101);
//		System.out.println(arminos);
//		System.out.println(arminos.size());
		String result = "/login.xhtml?faces-redirect=true";
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

		try {
			System.out.println("user logout");
			request.logout();
			
		} catch (ServletException ex) {
			ex.printStackTrace();
			
		}
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginBean other = (LoginBean) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + "]";
	}
	
	
}
