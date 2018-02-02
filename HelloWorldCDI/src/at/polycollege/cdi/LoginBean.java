package at.polycollege.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

// @ManagedBean(named="login")
@Named(value="login")
@RequestScoped
public class LoginBean {
	private String user;
	private String pass;
	@Inject LoginState loginState;
	
	public void doLogin() {
		switch(user) {
		case "admin":
		case "user1":
		case "test":
			loginState.setLoggedIn(pass.equals("passme"));
			loginState.setUser(user);
			return;
		default:
			loginState.setLoggedIn(false);
			return;
		}
	}

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
