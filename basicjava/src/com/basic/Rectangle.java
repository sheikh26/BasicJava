package com.basic;

public class Rectangle extends Shape {
	
	private int length;
	private  int width;
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @paparam length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {

		return width;
	}
	/**
	 * @paparam width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	public double area() {
		
		return length* width;
	}

}
