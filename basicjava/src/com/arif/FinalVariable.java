package com.arif;
public class FinalVariable {
	
	final static int speedlimit=90;//final variable  
	
	 void run(){  
	  //speedlimit=400;  
	 }  
	 public static void main(String args[]){  
			
			  FinalVariable obj=new FinalVariable(); 
			  obj.run();
			  
	 System.out.println("Final speedlimit"+ speedlimit);
	 }  
}