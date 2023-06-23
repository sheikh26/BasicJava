package com.basic;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}
	/**
	 * @paparam base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @paparam height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area() {
		
		return base * height/2;
	}

}
