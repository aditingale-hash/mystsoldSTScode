package com.junitdemo.service;

public class InvalidMarkException extends Exception {
	String message;

	public InvalidMarkException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
