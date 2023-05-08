package com.exception;

public class TestExp2 {

	public static void main(String[] args) {
		System.out.println("Main is callin a");
		try {
			a();
		} catch (Exception e) {
			System.out.println("Caught by Main " + e.getMessage());
			e.printStackTrace();
			System.out.println("**************************");
		}

	}

	public static void a() {
		System.out.println("a is callin b");
		b();

	}

	public static void b() {
		System.out.println("b is callin c");
		c();
	}

	public static void c() {

		System.out.println("c is callin d");
		d();
	}

	public static void d() {
		System.out.println("Congratulations!! finally you have reached to D");
		// ArithmeticException e = new ArithmeticException("Aaj ka message");

		boolean flag = true;
		if (flag) {
			UserNotFoundException e = new UserNotFoundException(
					"Aaj ka new Message");
			throw e;
		}
	}

}
