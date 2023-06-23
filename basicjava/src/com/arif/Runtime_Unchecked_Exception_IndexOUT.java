//package com.arif;

/*
 * public class Runtime_Unchecked_Exception_IndexOUT { public static void
 * main(String args[]) {
 * 
 * int num[] = {1, 2, 3, 4}; System.out.println(num[5]); } }
 */



  package com.arif;
  
  public class Runtime_Unchecked_Exception_IndexOUT {
	  public static void main(String args[]) { 
		  try {
			  int num[] = {1, 2, 3, 4}; 
			  System.out.println(num[5]); 
		  }
       catch (Exception e) {
    	   e.printStackTrace();
  System.out.println("No is less 5"); // TODO: handle exception 
  } 
		  }
	  }
 
