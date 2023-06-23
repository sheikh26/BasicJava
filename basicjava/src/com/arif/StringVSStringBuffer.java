package com.arif;

public class StringVSStringBuffer {

	public static void main(String[] args) {


		String s = new String("This "); //OBJ 1
		System.out.println(s);
        s += "is a "; //OBJ 2
        System.out.println(s);
        s += "String object"; //OBJ 3
        System.out.println(s);
        s += "String object 4"; //OBJ 4
        System.out.println(s);

        StringBuffer sb = new StringBuffer("This "); //OBJ 1
        sb.append("is a "); //OBJ 1
        sb.append("StringBuffer object"); 
        sb.append("StringBuffer object 4"); 
        System.out.println(sb);

	}

}
