package com.arif;

public class ConstructorThisStudent {
	
	int rollno;  
	String name;  
	float fee;  
	
	ConstructorThisStudent(int no,String na,float fe){  
	//rollno=rollno;  
	//name=name;  
	//fee=fee;  
	
	rollno=no;  
	name=na;  
	fee=fe;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}  
}
