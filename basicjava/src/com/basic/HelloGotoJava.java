package com.basic;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class HelloGotoJava {

	static String name = "Swati";

	public static void main(String[] args) {
		int i = 0;
		Label: System.out.println("Hello Java " + name);
		if(i<5){
			System.out.println("Inside " + i);
			i++;
			GOTO Label;
		}
	}
}
