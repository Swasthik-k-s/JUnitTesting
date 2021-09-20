package com.demo;

import java.util.regex.Pattern;

public class UserRegistration {
	String firstNamePattern = "[A-Z][a-zA-Z]{2,}";	
	String lastNamePattern = "[A-Z][a-zA-Z]{2,}";
	String phoneNumberPattern = "[1-9][0-9]\\s[1-9][0-9]{9}";
	String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
	String domain = "\\@[a-zA-Z0-9]+\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";
	String emailPattern = username + domain;
	String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,20}";

	public boolean validateFirstName(String firstname) {

		return Pattern.matches(firstNamePattern, firstname);
	}

	public boolean validateLastName(String lastname) {
		return Pattern.matches(lastNamePattern, lastname);
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		return Pattern.matches(phoneNumberPattern, phoneNumber);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(emailPattern, email);

	}

	public boolean validatePassword(String password) {
		return Pattern.matches(passwordPattern, password);
	}
}
