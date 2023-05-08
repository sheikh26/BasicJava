package com.exception;

public class TestPropagation {

	public static void main(String[] args) throws LoginException {
		System.out.println("This is Main");
		try {
			padosi();
			// } catch (LoginException e) {
			// System.out.println("Caught by Mohlla " + e.getMessage());
		} finally {
			System.out.println("This is Mohlla final");
		}
	}

	public static void padosi() throws LoginException {
		System.out.println("This is Padosi");
		// try {
		dady();
		// } catch (LoginException e) {
		// System.out.println("Caught by Padosi " + e.getMessage());
		// }
	}

	public static void dady() throws LoginException {
		System.out.println("This is Dady");
		// try {
		mummy();
		/*
		 * } catch (LoginException e) { System.out.println("Caught by Dady " +
		 * e.getMessage()); e.printStackTrace(); }
		 */
	}

	public static void mummy() throws LoginException {
		System.out.println("This is Mother");

		// try {
		you();
		// } catch (LoginException e) {
		// System.out.println("Caught by Mummuy " + e.getMessage());
		// }
	}

	public static void you() throws LoginException, RuntimeException {

		System.out.println("This is you");
		LoginException exception = new LoginException("Login Fail");

		throw exception;

	}
}
