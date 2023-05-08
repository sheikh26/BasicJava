package com.basic;

public class Person1 {
	public void a(){
		System.out.println("A");
	}
	public void B()
	{
		System.out.println("B");
	}
	public void C()
	{
		System.out.println("C");
	}
	
	
	public static void main(String[] args){
		
		Person1 p = new Manager();
		p.C();
		
	}	
}
 class Manager extends Person1 {
	public void C(){
		super.C();
		System.out.println("C1");
	}
	public void D()
	{
		System.out.println("D");
	}
	public void e()
	{
		System.out.println("e");
	}

}
