package com.exception;

import com.basic.Circle;

public class Love {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
		try {
			padosi();
		} catch (Exception e) {
			System.out.println("Exception Handled by Main");
			e.printStackTrace();
		}
	}
	public static void padosi() {
		pop();
	}
	public static void pop() {
		mom();
	}
	public static void mom() {
		you();
		/*
		try {
			you();
		}catch (NullPointerException e) {
			System.out.println("Null Exception Handled by Mom");
		} 
		catch (Exception e) {
			System.out.println("Exception Handled by Mom");
		}*/
	}

	public static void you() {

		Circle c = null;
		//try {
			System.out.println("Area is " + c.area());
/*		} catch (NullPointerException e) {
			System.out.println("Exception Handled by You");
		}
*/	}

}
