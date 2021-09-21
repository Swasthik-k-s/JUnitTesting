package com.test;

import org.junit.Test;

import com.demo.InvalidUserDetailException;
import com.demo.UserRegistration;

import junit.framework.Assert;

public class UserRegistrationTest {

	@Test
	public void firstnameiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateFirstName("Swasthik");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void firstnameislessthan3letters_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateFirstName("Sw");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void firstnamehavenocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateFirstName("swasthik");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void lastnameiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateLastName("Sks");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void lastnameislessthan3letters_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateLastName("K");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void lastnamehavenocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateLastName("sks");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void phonenumberiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePhoneNumber("91 6363136341");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void phonenumberhavenocountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePhoneNumber("6363136341");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void phonenumberhavinglessnumbers_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePhoneNumber("91 636313634");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void emailiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateEmail("swasthik.ks22@gmail.com");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void emailisinvalid_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validateEmail("abc45@google");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void passwordiscorrect_returntrue() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePassword("Pass2021%");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void passwordwithnocapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePassword("pass2021%");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void passwordwithnodigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePassword("Password%");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void passwordwithnospecialcharacter_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePassword("Pass2021");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}

	@Test
	public void passwordwhichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		try {
			boolean result = user.validatePassword("Pass21%");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailException e) {
			System.out.println(e);
		}
	}
}
