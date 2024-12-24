package binhdinh.hoaian.anthanh.model;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm{
	private String name;
	private int age;
	private String error;
	
	public User() {
	}
	public User(String name, int age, String error) {
        this.name = name;
        this.age = age;
        this.error = error;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
}
