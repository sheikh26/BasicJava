/**
 * Java training example source code developed by Galaxy Technologies, Indore
 * Copyright (c) 2008 Galaxy Technologies
 * 
 * @date 08/08/08
 * @version 1.0
 * @author param Sheikh
 * 
 * Declare int variables and sum them
 */

public class SumNumArgs {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int sum = a + b;
		System.out.println("Sum is " + sum);

	}

}
