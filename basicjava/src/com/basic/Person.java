package com.basic;

public class Person {

	private String name = null;

	private String address = null;
	
	private static int AVE_AGE = 60;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getAveAge(){
		return AVE_AGE;
	}
}
