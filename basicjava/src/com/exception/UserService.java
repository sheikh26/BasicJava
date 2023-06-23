package com.exception;

public class UserService {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) throws Exception {
		// try {
		authenticate("Galaxy", "123");

		try {
			authenticate1("abc", "123");
		} catch (Exception e) {

			if (e instanceof LoginException) {
				System.out.println("Login  Chield");
			}

			e.printStackTrace();
		}

		/*
		 * } catch (LoginException e) { System.out.println(e.getMessage()); }
		 */
	}

	public static void authenticate(String login, String pwd)
			throws LoginException {

		if (login.equals("Galaxy")) {
			System.out.println("User is Logged in");
		} else {
			LoginException e = new LoginException("User Id is invalid");
			throw e;
		}
	}

	public static void authenticate1(String login, String pwd) throws Exception {

		if (login.equals("Galaxy")) {
			System.out.println("User is Logged in");
		} else {
			LoginException e = new LoginException("User Id is invalid");
			throw e;
		}
	}

}
