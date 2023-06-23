package com.test;

import java.io.IOException;
import java.util.ArrayList;

import com.basic.Person;

public class Test {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Hello");
		
		Person person = new Person();
		l.add(person);
		
		
		System.out.println(l.contains("Hello"));
		
		try{
			System.out.println("Hello");
			throw new NullPointerException();
		}finally{
			System.out.println("Finallay called");
		}

	}

}
