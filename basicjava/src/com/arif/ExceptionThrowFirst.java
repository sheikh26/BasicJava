package com.arif;

public class ExceptionThrowFirst {

	public static void checkNum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("\n Number is negative");
		}
		else
		{
			System.out.println("Square of "+num+ " is " +(num*num));
		}
	}
	//main method
	public static void main(String args[])
	{
		ExceptionThrowFirst t=new ExceptionThrowFirst();
		t.checkNum(2);
		System.out.println("rest of the code");
	}
}
