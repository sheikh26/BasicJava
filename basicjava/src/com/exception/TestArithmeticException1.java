package com.exception;

import com.basic.Circle;

public class TestArithmeticException1 {

	public static void main(String[] args) {

		//arithmeticEx(0);
		//nullPointerEx();

		try {
			arrayIndexOutOfBound();
			//stringIndexOutOfBound();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(" Strign Index caought in Main "
					+ e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println(" Array Index caought in Main " + e.getMessage());

		}
		System.out.println("Main is finish");
	}

	public static void arithmeticEx(int divident) {

		int j = 0;
		try {
			j = 100 / divident;
			System.out.println(" Value of J is " + j);
		} catch (ArithmeticException sheetal) {
			System.out
					.println("Opps : Divident is Zero, Pl try a  non zero number "
							+ sheetal.getMessage());
		}

	}

	public static void nullPointerEx() {

		Circle c = null; // new Circle();
		try {
			c.setRadius(5);
			System.out.println(" Circle Area " + c.area());
		} catch (NullPointerException e) {
			System.out
					.println("Oops : You object is null, Pl intialize the value by 'new'"
							+ e.getMessage());
		}

	}

	public static void arrayIndexOutOfBound()
			throws ArrayIndexOutOfBoundsException {
		int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < 11; i++) {
			System.out.println("Table " + table[i]);
		}

	}

	public static void stringIndexOutOfBound()
			throws StringIndexOutOfBoundsException {
		String name = "Vijay";

		System.out.println(" Character at 6 is " + name.charAt(5));
	}

}
