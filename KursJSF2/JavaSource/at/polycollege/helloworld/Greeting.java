package at.polycollege.helloworld;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="greeting")
@SessionScoped
public class Greeting implements Serializable {
	/**
	 * 
	 */
	private String name = null;
	private String age = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGreeting() {
		if (name == null) {
			return "Please enter your name";
		}
		else {
			return "Hello, " + name + ", you are " + age + " year old";
		}
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
