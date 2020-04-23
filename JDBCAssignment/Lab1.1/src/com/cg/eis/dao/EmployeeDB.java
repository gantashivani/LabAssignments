package com.cg.eis.dao;

import java.sql.*;

public class EmployeeDB {
	public static Connection getConnection1() throws Exception {

		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "shivani", "shivani123");

		return conn;
	}

}
