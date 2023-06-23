package com.basic;



public class TestShape {

	public static void main(String[] args) {
		testRectangle();
		testCircle();
		testTriangle();
		testShape();
		
	}
	
	public static void testRectangle() {
		Rectangle r = new Rectangle();
		r.setColor("Red");
		r.setBorderWidth(34);
		//r.setRadius(3);

		System.out.println("Area is Rectangle" + r.area());
		System.out.println("Color is Rectangle"+r.color);

	}

	public static void testCircle() {
		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(34);
		c.setRadius(3);

		System.out.println("Area is Circle" + c.area());
		System.out.println("Color is Circle"+ c.color);

	}

	public static void testTriangle() {
		Triangle t = new Triangle();
		t.setColor("Red");
		t.setBorderWidth(34);
		t.setBase(10);
		t.setHeight(100);
		
		System.out.println("Area is Triangle" + t.area());
		System.out.println("Color is Triangle" + t.getColor());
		
	}
	
	public static void testShape() {

		
		Shape s = null; // Declaration
		// s = new Shape("Triangle"); // Instantiation
		s = new Circle();// Instantiation

		s.setColor("Lal");

		//s.area();
		
		//Shape shape = new Shape();

		System.out.println("---------s.area()------"+s.area());
		/*
		 * s.setColor("Red"); s.setBorderWidth(3);
		 * 
		 * System.out.println("Color is Shape" +s.getBorderWidth());
		 * System.out.println("Color is BorderWidth"+s.getBorderWidth());
		 */
		//System.out.println("This is a one paparam Constructor of Shape class"+s.);
		
	}
}
