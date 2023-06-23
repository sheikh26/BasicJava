package com.arif;


public class ExceptionMultipleCatch {
	
	
	
	public static void main(String args[])
	{
		//String name = "Vijay";
		String name = null;
		try {
			System.out.println("Hiiiiii");
			System.out.println("Length  is "+name.length());
			System.out.println("Length name is "+name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai");
		}
		  catch (NullPointerException e) {
			  System.out.println("Sundar sa naam nahi hai");
		}
		//Genetic Catch
		
		  catch (Exception e) { 
		 e.printStackTrace();
		  System.out.println("Sundar sa naam nahi hai exception"); }
		 
		finally {
			System.out.println("Muslim hu me.");
		}
	}

}
