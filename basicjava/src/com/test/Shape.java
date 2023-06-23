package com.test;

public  class Shape {
	private String color = null;
	private int borderWidth = 0;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @paparam color
	 *            the color to set
	 * @return 
	 */
	public String setColor(String color) {
		return this.color = color;
	}

	/**
	 * @return the borderWidth
	 */
	public int getBorderWidth() {
		return borderWidth;
	}

	/**
	 * @paparam borderWidth
	 *            the borderWidth to set
	 * @return 
	 */
	public int setBorderWidth(int borderWidth) {
		return this.borderWidth = borderWidth;
	}

}
