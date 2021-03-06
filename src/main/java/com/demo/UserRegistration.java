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
	
	IValidateUserDetail validateFirstNamelambda = (firstName) -> Pattern.matches(firstNamePattern, firstName);
	IValidateUserDetail validateLastNamelambda = (lastName) -> Pattern.matches(lastNamePattern, lastName);
	IValidateUserDetail validatePhonelambda = (phone) -> Pattern.matches(phoneNumberPattern, phone);
	IValidateUserDetail validateEmaillambda = (email) -> Pattern.matches(emailPattern, email);
	IValidateUserDetail validatePasswordlambda = (password) -> Pattern.matches(passwordPattern, password);

	public boolean validateFirstName(String firstname) throws InvalidUserDetailException {

		boolean fnameResult = validateFirstNamelambda.validateUserDetail(firstname);
		if (fnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid First name");
		}
	}

	public boolean validateLastName(String lastname) throws InvalidUserDetailException {
		boolean lnameResult = validateLastNamelambda.validateUserDetail(lastname);
		if (lnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Last name");
		}
	}

	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException {
		boolean phoneResult = validatePhonelambda.validateUserDetail(phoneNumber);
		if (phoneResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Phone number");
		}
	}

	public boolean validateEmail(String email) throws InvalidUserDetailException {
		boolean emailResult = validateEmaillambda.validateUserDetail(email);
		if (emailResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Email address");
		}
	}

	public boolean validatePassword(String password) throws InvalidUserDetailException {
		boolean passwordResult = validatePasswordlambda.validateUserDetail(password);
		if (passwordResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid password");
		}
	}

}
