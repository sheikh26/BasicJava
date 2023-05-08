package com.exception;

public class TestCustPropagation {

	public static void main(String[] args) {
		System.out.println("This is Main");
		try {
			padosi();
		} catch (RuntimeException e) {
			System.out.println("Caught by Padosi " + e.getMessage());
		} finally {
			System.out.println("This is Padosi final");
		}
	}

	public static void padosi() {
		System.out.println("This is Padosi");
		// try {
		dady();
		// } catch (RuntimeException e) {
		// System.out.println("Caught by Padosi " + e.getMessage());
		// }
	}

	public static void dady() {
		System.out.println("This is Dady");
		// try {
		mummy();
		// } catch (RuntimeException e) {
		// System.out.println("Caught by Dady " + e.getMessage());
		// }

	}

	public static void mummy() {
		System.out.println("This is Mother");

		System.out.println("This is Dady");
		// try {
		you();
		// } catch (RuntimeException e) {
		// System.out.println("Caught by Mummuy " + e.getMessage());
		// }
	}

	public static void you() {
		System.out.println("This is you");
		String name = "Vijay Dinanth Chohan";
		try {
			System.out.println("Length of name is " + name.length());

			System.out.println(" 8th Carachater of name is " + name.charAt(7));

		} catch (NullPointerException e) {
			System.out.println("Name is null");

		} /*
			 * catch (RuntimeException e) { System.out.println("
			 * RuntimeException is " + e.getMessage()); }
			 */

	}

}
