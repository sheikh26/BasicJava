package com.basic;

public class MyMath {

	public static void main(String[] args) throws Exception {

		int ch = System.in.read();
		//char abc = (Char) ch;a
		System.out.println("Selected ASCII Code " + ch);

		if (ch == 'A' || ch == 'a') {
			Add.main(args);
		} else if (ch == 'D' || ch == 'd') {
			Division.main(args);
		} else {
			System.out.println("Incorrect Choice ");
		}
	}

}
