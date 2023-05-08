package com.exception;

public class AccountException extends Exception {

	public AccountException() {
		super("This is Default Constructor");
	}

	public AccountException(String message) {
		super(message);
	}

}
