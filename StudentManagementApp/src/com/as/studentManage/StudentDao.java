package com.as.studentManage;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDao {
	public static boolean insertStudentToDB(StudentModel student) {
		boolean isConnectionEstablished = false;
		try {
			// JDBC Code to insert a student into the database

			Connection connection = ConnectionProgram.createConnectionprogram();
			String query = "INSERT INTO students (Sname, Sphone, Scity) VALUES (?,?,?);";

			// PreparedStatement interface

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			
			preparedStatement.setString(1, student.getStudentName());
			preparedStatement.setString(2, student.getStudentPhone());
			preparedStatement.setString(3, student.getStudentCity());

			// execute the query
			preparedStatement.executeUpdate();
			isConnectionEstablished = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isConnectionEstablished;
	}
}
