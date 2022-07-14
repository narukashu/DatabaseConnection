package com.as.studentManage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProgram {

	static Connection connection;

	// Non-static method
	public static Connection createConnectionprogram() {

		// Exception -- I would like to check whether the database is loading or not

		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create the connection
			String user = "root";
			String password = "password";
			String url="jdbc:mysql://localhost:3306/StudentManage?autoReconnect=true&useSSL=false";

			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
