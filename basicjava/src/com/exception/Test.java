package com.exception;

public class Test {

	public static void main(String[] args) {

		int i = 0;

		String name = null;//"Vijay Dinanth Chohan";
		try {
			i = 15 / i;
		} catch (ArithmeticException e) {
			System.out.println("Division can not be Zero");
		}

		try {
			System.out.println(" 7th Chr is " + name.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("Value can not be null");
		} catch (RuntimeException e) {
			System.out.println("Caught by RTE " + e.getMessage());
		} finally {
			System.out.println("The End");
		}

		System.out.println("Output " + i);
	}

	public static void main1(String[] args) {

		int i = 0;

		String name = "Vijay Dinanth Chohan";
		try {
			i = 15 / i;
		} catch (ArithmeticException e) {
			System.out.println("Division can not be Zero");
		}

		try {
			System.out.println(" 7th Chr is " + name.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("Value can not be null");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Index chota karo");
		} finally {
			System.out.println("The End");
		}

		System.out.println("Output " + i);
	}

}
