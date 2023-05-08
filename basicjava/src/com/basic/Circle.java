package com.basic;

public class Circle extends Shape {
	
	private int radius = 5;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
System.out.println("Circle ka area call hua hai...."+3.14* getRadius()* radius);

		return 3.14* getRadius()* radius;
	}

}
