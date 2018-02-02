package at.polycollege.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

// @ManagedBean(name="loginState")
@Named(value="loginState")
@SessionScoped
public class LoginState implements Serializable {
	private String user;
	private boolean isLoggedIn;
	
	@Produces @User public String getUser() {
		return isLoggedIn ? user : null;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
}
