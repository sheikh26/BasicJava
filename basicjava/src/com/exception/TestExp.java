package com.exception;

public class TestExp {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			try {
				testException(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception handled by MOM");
				e.printStackTrace();

			}

		}
	}

	public static void testException(int i) {
		System.out.println("Case is [ " + i + " ]");
		switch (i) {
		case 0:
			int k = 0;
			try {
				int j = 123 / k;
			} catch (ArithmeticException e) {
				System.out.println("Got ArithmeticException exception");
				// e.printStackTrace();
			} finally {
				System.out.println("I will be executed in both cases");
			}

			break;
		case 1:
			String name = null; // "Vijay";
			try {
				System.out.println(name.length() + name.charAt(9));
			} catch (NullPointerException e) {
				// System.out.println("Got NullPointerException exception");
				System.out.println("Opps. you did not intialize name string");

			} catch (StringIndexOutOfBoundsException e) {
				// System.out.println("Got StringIndexOutOfBoundsException
				// exception");
				System.out.println("Dil mange more " + e.getMessage());
			}
			break;
		case 2:
			String[] names = new String[2];
			
			System.out.println(names[3]);

			break;
		case 3:
			Object o = "This is a String";
			try {
				Integer in = (Integer) o;
			} catch (ClassCastException e) {
				System.out.println("Oops Casting is wrong pl casr wirh "
						+ e.getMessage());
			}

			break;
		default:
			System.out.println("This is Default");

		}

	}

}
