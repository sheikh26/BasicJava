package com.test;

import com.dto.Point;

public class TestPoint {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
		
		int x= 5;
		int y = 10;
		
		int x1= 15;
		int y1 = 110;
		
		int x2= 115;
		int y2 = 1110;
		
		Point p;
		p =new Point();
		p.x= 90;
		p.y = 88;
		
		Point p1 = new Point();
		p1.x= 78;
		p1.getZ();
		
	
		
		System.out.println("Circle center points are " + p.x + ", " + p.y);
		System.out.println("Circle center points are " + p1.x + ", " + p1.y);
		
		
	}

}
