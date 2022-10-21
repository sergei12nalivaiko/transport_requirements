package by.rw.tt.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import by.rw.tt.dao.PersonDao;
import by.rw.tt.entity.Person;


@SuppressWarnings("deprecation")
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 6363905124188580639L;
	
	@EJB
	private PersonDao personDao;


	private String username;
	private String password;

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
		
		HttpServletRequest request = (HttpServletRequest) (FacesContext.getCurrentInstance().getExternalContext()
				.getRequest());
		try {
			request.login(username, password);
			if (request.isUserInRole("TR")) {
				return "pages/main.xhtml?faces-redirect=true";
			} else {
				return logout();
			}
		} catch (ServletException e) {
			e.printStackTrace();
			System.out.println("Неверно введен пользователь или пароль.");
		}
		return "login";
	}

	public String logout() {
		List<Person> persons = personDao.selectPersonAllInfoByID("0000071841");
		System.out.println(persons);
		
		String result = "/login.xhtml?faces-redirect=true";
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

		try {
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
