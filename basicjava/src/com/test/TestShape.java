package com.test;

import com.test.Shape;

public class TestShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shape s = new Shape();
		s.setBorderWidth(5);
		s.setColor("Red");
		String color = s.setColor("Red");
		int borderWidth = s.setBorderWidth(5);
		
		System.out.println("BorderWidth is "+ borderWidth);
		System.out.println("Color is "+ color);

	}

}
