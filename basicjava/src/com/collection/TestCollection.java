package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList v = new ArrayList();

		v.add("Manish");
		v.add("Rajnish");
		v.add("Rakesh");

		Integer i = new Integer(5);

		v.add(i);

		Integer value = (Integer) v.get(3);

		System.out.println("3 value is " + value);

		for (int j = 0; j < v.size(); j++) {
			System.out.println(j + " : " + v.get(j));
		}
	}

}
