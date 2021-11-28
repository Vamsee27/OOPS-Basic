package com.emailapp.service;

import java.util.Scanner;

import com.emailapp.model.Employee;

public class Driver {
	
	static Employee emp = new Employee("harshith","choudhary");
	
	static CredentialService service = new CredentialService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String dept,email = null;
		char[] password = null;
		
		switch(choice) {
		
		case 1 : dept = "tech";
				email = service.generateEmailAddress(emp.getfirstname(), emp.getlastname(), dept);
				password = service.generatePassword();
				service.showCredentials(emp.getfirstname(), email, password);
				break;
		case 2 : dept = "admin";
				email = service.generateEmailAddress(emp.getfirstname(), emp.getlastname(), dept);
				password = service.generatePassword();
				service.showCredentials(emp.getfirstname(), email, password);
				break;
		case 3 : dept = "hr";
				email = service.generateEmailAddress(emp.getfirstname(), emp.getlastname(), dept);
				password = service.generatePassword();
				service.showCredentials(emp.getfirstname(), email, password);
				break;
		case 4 : dept = "legal";
				email = service.generateEmailAddress(emp.getfirstname(), emp.getlastname(), dept);
				password = service.generatePassword();
				service.showCredentials(emp.getfirstname(), email, password);
				break;
				
		default : 
			System.out.println("Invalid department"); 
			break;
		
		}
		
		

	}

}
