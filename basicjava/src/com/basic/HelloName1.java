package com.basic;

public class HelloName1 {

	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Usage : java -cp c:/bin com.basic.HelloName1");
		}

	}
}
