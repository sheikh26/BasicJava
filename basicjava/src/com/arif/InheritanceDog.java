package com.arif;

public class InheritanceDog extends InheritanceAnimal{
	
	void bark(){
		System.out.println("barking...");
		}  
	
	public static void main(String args[]){  
		InheritanceDog dr=new InheritanceDog();  
		dr.bark();  
		dr.eat();  
		}
	}  
