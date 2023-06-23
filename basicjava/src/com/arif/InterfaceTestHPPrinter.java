package com.arif;

public class InterfaceTestHPPrinter implements InterfacePrintable{
	
	public void print(){
		System.out.println("Hello HP Printing");
		}  
	
	public static void main(String args[]){  
		InterfaceTestHPPrinter obj = new InterfaceTestHPPrinter();  
		obj.print();  
		 }

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}  
}
