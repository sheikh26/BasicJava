package com.arif;

public class OverriddingTest {
	public static void main(String args[]){  
		
	Over_SBI s=new Over_SBI();  
	Over_ICICI i=new Over_ICICI();  
	Over_AXIS a=new Over_AXIS();  
	
	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
	/*
	 * System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
	 * System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
	 */  
	}  
}
