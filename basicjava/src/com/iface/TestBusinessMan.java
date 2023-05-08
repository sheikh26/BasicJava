package com.iface;

public class TestBusinessMan {

	public static void main(String[] args) {
		
		BusinessMan bm = new BusinessMan();
		
	
		RichMan rm = new BusinessMan();
		
		rm.donation();
		
		SocialWorker sw = new BusinessMan();
		
		
		BusinessMan bm1 = (BusinessMan)sw;
		
		
		
		

	}

}
