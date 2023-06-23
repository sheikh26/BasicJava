package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallStatement {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) throws Exception {
		
		

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/test", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL ProTest(?)}");

		callStmt.registerOutPaparameter(1, Types.INTEGER);

		callStmt.execute();

		System.out.println(" Count " + callStmt.getInt(1));


	}

}
