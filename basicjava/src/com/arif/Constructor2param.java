package com.arif;

public class Constructor2param {
	int id;  
    String name;  
    //creating a parameterized constructor  
    Constructor2param(int i,String n){  
    id = i;  
    name = n;  
    }  
    public Constructor2param() {
		System.out.println("Def Cons");
	}
	//method to display the values  
    void display(){
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	Constructor2param s2 = new Constructor2param(); 
    	Constructor2param s1 = new Constructor2param(111,"Karan");  
    	//Constructor2param s2 = new Constructor2param(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    //s2.display();  
   }  
}
