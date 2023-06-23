package com.exception;

import com.basic.Circle;

public class TestArithmeticException {

	public static void main(String[] args) {

		arithmeticEx();

		//nullPointerEx();

	    //arrayIndexOutOfBound();
	   
		try {
			
			//stringIndexOutOfBound();
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(" Strign Index caought by Main "
					+ e.getMessage());
		} 
		catch (RuntimeException e){
			System.out.println("Caught by RuntimeException" + e.getMessage());
					
		}
       		
/*		catch (StringIndexOutOfBoundsException e) {
			System.out.println(" Strign Index caought by Main "
					+ e.getMessage());
		}catch (NullPointerException e){
			System.out.println(" No Vijay, String is null"
					+ e.getMessage());
		}
*/		
		
		//raiseException();
		
		System.out.println("Main is finish");
	}

	public static void arithmeticEx() {

		int i = 0;
		try {

			int j = 100;
			int k=j/i;
			System.out.println(" Value of J is " + k);
			
		} catch (ArithmeticException e) {
			System.out
					.println("Opps :  Divident is Zero, Pl try a non zero number "
							+ e.getMessage());
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("HI I am a muslim");
		}


	}

	public static void nullPointerEx() {

		Circle c = null;
		//c = new Circle();

		try {
			c.setRadius(5);
			System.out.println(" Circle Area " + c.area());
		} catch (NullPointerException e) {
			System.out
					.println("Oops : You object is null, Pl intialize the value by 'new'"
							+ e.getMessage());
		}

	}

	public static void arrayIndexOutOfBound() {
		int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println("Table " + table[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bhaiya element kum he");

		}

	}

	public static void stringIndexOutOfBound(){
		
		String name = null;
		
		//name = "Vijay";

		System.out.println(" Chata Character hai " 
				+ name.charAt(5));
	}
	
	public static void raiseException(){
		
		NullPointerException e 
		= new NullPointerException("Meri Bhul");
		throw e;
		
	}

}
