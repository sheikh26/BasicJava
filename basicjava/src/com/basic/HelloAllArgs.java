package com.basic;

public class HelloAllArgs {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " = Hello " + args[i]);
		}

	}
}
