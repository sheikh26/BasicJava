package com.inheritance;

public class TestPerson {

	public static void main(String[] args) {
		
		System.out.println("$$Calling Person Class 2 Param Constructor");

		Person p = new Person("Savita", "Saluja");

		System.out.println(" First Name " + p.getFirstName());

		System.out.println(" Last Name " + p.getLastName());

		//System.out.println(" Address is " + p.getAddress());

		System.out.println("__________________________________ ");
		

		System.out.println("$$Calling Person Class 3 Param Constructor");
		
		//Employee e = new Employee("Nakul", "Shukla", "CEO");
		Person e = new Person("Savita", "Saluja","Palasia");

		System.out.println(" First Name " + e.getFirstName());

		System.out.println(" Last Name " + e.getLastName());

		System.out.println(" Designation " + e.getAddress());
		
		System.out.println("__________________________________ ");
		//Test override method
		
		
		//System.out.println("$$Calling Person Class default Constructor");
		
	    Person p1 = new Person();
	    p1.changeAddress();
	    
		//System.out.println("\n\n$$Calling Employee Class default Constructor");
	    Person p2 = new Employee();
	    
	    p2.changeAddress();
	    //p2.getFirstName();
	    
	    
	    
	}

}
