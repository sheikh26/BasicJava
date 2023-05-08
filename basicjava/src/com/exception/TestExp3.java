package com.exception;

public class TestExp3 {

	public static void main(String[] args) {
		System.out.println("Main is callin a");

		try {
			a();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void a() throws AccountException {
		System.out.println("a is callin b");
		b();

	}

	public static void b() throws AccountException{
		System.out.println("b is callin c");
		c();

	}

	public static void c() throws AccountException{

		System.out.println("c is callin d");
		d();
	}

	public static void d() throws AccountException {

		AccountException e = new AccountException("Mera Account Sandesh");

		boolean flag = true;
		if (flag) {
			throw e;
		}


	}

}
