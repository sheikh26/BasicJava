package com.basic;

/**
 * Java training example source code developed by Galaxy Technologies, Indore
 * Copyright (c) 2008 Galaxy Technologies
 * @date 08/08/08
 * @version 1.0
 * @author param Sheikh
 * 
 */

public class Division2 {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out
					.println("USAGE : java -cp <bin path> com.basic.Division1 <n1> <n2>");
			return;
		}
		doDivision(args);
	}

	public static void doDivision(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = a/b;

		System.out.println("Division is " + div);
		
	}
}
