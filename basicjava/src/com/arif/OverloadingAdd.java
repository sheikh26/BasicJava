package com.arif;

public class OverloadingAdd {
	
	static int add(int a,int b)
	{
		return a+b;
		}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
		} 
	public static void main(String[] args){  
		System.out.println(OverloadingAdd.add(11,12));  
		System.out.println(OverloadingAdd.add(13,14,15));  
		}

}
