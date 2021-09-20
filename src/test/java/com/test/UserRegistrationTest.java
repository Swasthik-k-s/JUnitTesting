package com.test;

import org.junit.Test;

import com.demo.UserRegistration;

import junit.framework.Assert;

public class UserRegistrationTest {
	
	@Test
	public void firstnameiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("Swasthik");
		Assert.assertTrue(result);
	}

	@Test
	public void firstnameislessthan3letters_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("Sw");
		Assert.assertFalse(result);
	}

	@Test
	public void firstnamehavenocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("swasthik");
		Assert.assertFalse(result);
	}

	@Test
	public void lastnameiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Sks");
		Assert.assertTrue(result);
	}

	@Test
	public void lastnameislessthan3letters_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("K");
		Assert.assertFalse(result);
	}

	@Test
	public void lastnamehavenocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("sks");
		Assert.assertFalse(result);
	}

	@Test
	public void phonenumberiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 6363136341");
		Assert.assertTrue(result);
	}

	@Test
	public void phonenumberhavenocountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("6363136341");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid phone number that doesn't
	 * have all 10 digits
	 */
	@Test
	public void phonenumberhavinglessnumbers_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 636313634");
		Assert.assertFalse(result);
	}

	@Test
	public void emailiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("swasthik.ks22@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void emailisinvalid_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("abc45@google");
		Assert.assertFalse(result);
	}

	@Test
	public void passwordiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Pass2021%");
		Assert.assertTrue(result);
	}

	
	@Test
	public void passwordwithnocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("pass2021%");
		Assert.assertFalse(result);
	}

	@Test
	public void passwordwithnodigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Password%");
		Assert.assertFalse(result);
	}

	@Test
	public void passwordwithnospecialcharacter_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Pass2021");
		Assert.assertFalse(result);
	}

	@Test
	public void passwordwhichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Pass21%");
		Assert.assertFalse(result);
	}
}
