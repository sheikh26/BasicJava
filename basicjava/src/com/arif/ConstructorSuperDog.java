package com.arif;

public class ConstructorSuperDog extends ConstructorSuperAnimal{

	String color="black"; 
	
	void printColor(){  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}  
	
	public static void main(String args[]){  
		ConstructorSuperDog d=new ConstructorSuperDog();  
		d.printColor();  
		}
}
