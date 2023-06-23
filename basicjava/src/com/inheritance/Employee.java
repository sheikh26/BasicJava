package com.inheritance;

public class Employee extends Person {

	private String designaiton = null;
	
	protected String dob = null;

	public Employee() {
		System.out.println("****Employee Default Constructor");
	}

	public Employee(String fn, String ln, String des) {
		
		super(fn, ln);
		
		designaiton = des;
		
		System.out.println("****Employee 3 paparam  Constructor");
		

	}

	public String getDesignaiton() {
		return designaiton;
	}

	public void setDesignaiton(String designaiton) {
		this.designaiton = designaiton;
	}

	public void changeAddress() {
		
		System.out.println("*****");
		super.changeAddress();
		System.out.println("Employee ka change Address");
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
}
