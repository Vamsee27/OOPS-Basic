package com.emailapp.service;

import java.util.Random;

public class CredentialService {
	
	public static char[] generatePassword() {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< password.length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
	
	public String generateEmailAddress(String firstname, String lastname, String department) {
		
		return firstname+lastname+"@"+department+".abc.com";
		
	}
	
	public void showCredentials(String firstname, String email, char[] password) {
		System.out.println("Dear "+firstname+" your generated credentials as follows");
		System.out.println("Email   --->  "+email);
		System.out.println("Password   --->  "+password);
	}


}
