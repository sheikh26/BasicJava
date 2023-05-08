package com.iface;

public class Employee implements DropDownList {

	private int empCode = 0;

	private String firstName = null;

	private String lastName = null;

	public Employee(int c, String fn, String ln){
		empCode = c;
		firstName = fn;
		lastName = ln;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getKey() {
		
		return String.valueOf(empCode);
	}

	
	public String getValue() {
		return lastName + ", " + firstName;
	}
	
	

}
