package com.arif;

public class ConstructorThisStudent {
	
	int rollno;  
	String name;  
	float fee;  
	
	ConstructorThisStudent(int rollno,String name,float fee){  
	//rollno=rollno;  
	//name=name;  
	//fee=fee;  
	
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}  
}
