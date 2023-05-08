package com.jdbc;

import java.sql.*;

public class TestMSDBCity {

	public static void main(String args[]) throws Exception {
		// testUpdate();
		testSelect();
	}

	public static void testSelect() throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection conn = DriverManager.getConnection("jdbc:odbc:BATCH24SEPT",
				"", "");

		Statement stmt = conn.createStatement();

		ResultSet rs = null;

		rs = stmt.executeQuery("SELECT id,name  from city");

		System.out.println("ID\tName");
		System.out.println("--\t----");

		while (rs.next()) {

			System.out.print(rs.getString(1));
			System.out.println("\t" + rs.getString("name"));
		}

		stmt.close();
		conn.close();

	}

	public static void testUpdate() throws Exception {
		// Class.forName("com.mysql.jdbc.Driver").newInstance();
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=root");

		Connection conn = DriverManager.getConnection("jdbc:odbc:BATCH06", "",
				"");

		/*
		 * Statement stmt = conn.createStatement(); int recCount =
		 * stmt.executeUpdate("insert into employee values(3,'Nikku','Verma')");
		 */

		PreparedStatement ps = conn
				.prepareStatement("insert into employee values(?,?,?)");

		ps.setInt(1, 6);
		ps.setString(2, "Chandra");
		ps.setString(3, "Joshi");
		int recCount = ps.executeUpdate();

		System.out.println("# of Records" + recCount);

		// stmt.close();
		ps.close();
		conn.close();

	}

}