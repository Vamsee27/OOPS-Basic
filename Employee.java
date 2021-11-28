package com.emailapp.model;

public class Employee {
	
	String firstname;
	String lastname;
	
	public Employee(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getfirstname() {
		return firstname;
	}
	public String getlastname() {
		return lastname;
	}

}
