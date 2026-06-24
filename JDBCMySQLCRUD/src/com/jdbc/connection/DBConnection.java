package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "rps@123";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			// Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create connection
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connected to database!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
