package com.demo;

import java.util.regex.Pattern;

public class UserRegistration {
	String firstNamePattern = "[A-Z][a-zA-Z]{2,}";	
	String lastNamePattern = "[A-Z][a-zA-Z]{2,}";
	String emailPattern = "[a-zA-Z][0-9a-zA-Z]*([.\\-_+][0-9a-zA-Z]+)?\\@[0-9a-zA-Z]+\\.[a-zA-Z]+([.][a-z]{2})?";
	String phoneNumberPattern = "[1-9][0-9]\\s[1-9][0-9]{9}";
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
