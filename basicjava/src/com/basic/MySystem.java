package com.basic;

/**
 * Java training example source code developed by Galaxy Technologies, Indore
 * Copyright (c) 2008 Galaxy Technologies
 * 
 * @date 08/08/08
 * @version 1.0
 * @author Arif Sheikh
 * 
 */

public class MySystem {
	
	/**
	 * Launch and native application notepad.exe
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String[] args)throws Exception{
		Runtime.getRuntime().exec("notepad.exe");
	}

}
