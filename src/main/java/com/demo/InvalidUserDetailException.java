package com.demo;

@SuppressWarnings("serial")
public class InvalidUserDetailException extends Exception{
	InvalidUserDetailException(String message) {
		super(message);
	}
}
