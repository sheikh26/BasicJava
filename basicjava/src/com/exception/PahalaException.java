package com.exception;

public class PahalaException {

	public static void main(String[] args) {
		arithmeticException();
		//nullException();
		//arrayException();

	}

	public static void arrayException() {
		int[] table = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println(table[15]);
	}

	public static void nullException() {

		String name = "Vijay";

		int vijayLength = name.length();
		char chathaChar = name.charAt(6);

		System.out.println("Length of name is " + vijayLength);

		System.out.println(" 7th Carachater of name is " + chathaChar);

	}

	public static void arithmeticException() {

		int divident = 0;
		int number = 15;
		int calc = 0;

		calc = number / divident;

		System.out.println("Calc " + calc);

	}
}
