package com.arif;

public class Constructor2param {
	int id;  
    String name;  
    String addStudent;
    //creating a paparameterized constructor  
    Constructor2param(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    Constructor2param(int i,String n, String add){  
        id = i;  
        name = n;  
        addStudent = add;
        }  
    
    
    public Constructor2param() {
		System.out.println("This is a Def Cons");
	}
	//method to display the values  
    void display2param(){
    	System.out.println(id+" "+name);
    	}  
    void display3param(){
    	System.out.println(id+" "+name+" "+addStudent);
    	}  
    
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	Constructor2param s1 = new Constructor2param(); 
    	Constructor2param s2 = new Constructor2param(111,"Michel"); 
    	Constructor2param s3 = new Constructor2param(111,"Michel","Khajrana"); 
    	//Constructor2paparam s2 = new Constructor2paparam(222,"Aryan");  
    //calling method to display the values of object  
    s2.display2param();  
    s3.display3param();  
   }  
}
