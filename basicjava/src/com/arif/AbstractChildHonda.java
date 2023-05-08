package com.arif;

public class AbstractChildHonda extends AbstractClassBike{

	@Override
	void run(){
		System.out.println("running safely..");
		}  
	
	public static void main(String args[]){    
		AbstractClassBike b = new AbstractChildHonda();
		//b=new AbstractChildHonda();  
		b.run();
		b.changeGear();
		//System.out.println("Rate of Interest is: "+ b.run());        
		}

}
