package com.test;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.demo.UserRegistration;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class EmailTest {
	private String email;
	private boolean expectedResult;
	private UserRegistration user;
	
	public EmailTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialise() {
		user = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com ", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void parameterized_emailtesting_returntrueorfalse() {
		Assert.assertEquals(expectedResult, user.validateEmail(email));
	}
}
