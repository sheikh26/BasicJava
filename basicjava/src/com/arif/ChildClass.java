package com.arif;


public class ChildClass extends ParentClass{
	
	void test1() {
		System.out.println("Child");
	}
	public static void main(String args[]){ 
	ParentClass parentClass = new ChildClass();
	parentClass.test();
	
	ChildClass childClass = new ChildClass();
	childClass.test();
	childClass.test1();
		
	}
	}
