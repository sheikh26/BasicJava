package com.basic;

/**
 * Java training example source code developed by Galaxy Technologies, Indore
 * Copyright (c) 2008 Galaxy Technologies
 * @date 08/08/08
 * @version 1.0
 * @author param Sheikh
 * 
 */

import java.util.ResourceBundle;

public class AccessData {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResourceBundle rb = ResourceBundle.getBundle("com.basic.messages");

		String db = rb.getString("database");

		getData(getDataBase(db));

	}

	public static Database getDataBase(String db) {

		System.out.println("***" + db + "****");

		if (db.equals("oracle")) {

			return new Oracle();

		} else if (db.equals("mysql")) {

			return new MySQL();
		} else {
			return null;
		}

	}

	public static void getData(Database db) {
		System.out.println(db.getData());

	}

}
