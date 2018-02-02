package at.polycollege.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

// @ManagedBean(name="hello")
@Named(value="hello")
@RequestScoped
public class Hello {
	@Inject @User String user;
	
	public String getWelcome() {
		if (user == null) {
			return "Please login!";
		}
		else {
			return "Welcome, " + user + "!";
		}
	}
}
