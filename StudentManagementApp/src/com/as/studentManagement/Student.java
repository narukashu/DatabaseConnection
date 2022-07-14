package com.as.studentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.as.studentManage.StudentDao;
import com.as.studentManage.StudentModel;

public class Student {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to Student Management App\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add new Student Record");
			System.out.println("Press 2 to delete Student Record");
			System.out.println("Press 3 to display Student Record");
			System.out.println("Press 4 to EXIT");

			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add student
				System.out.println("Enter Student Name: ");
				String name = br.readLine();
				System.out.println("Enter Student Phone Number: ");
				String phone = br.readLine();
				System.out.println("Enter Student City: ");
				String city = br.readLine();

				// Create a Student object to store student details
				StudentModel studentModel = new StudentModel(name, phone, city);
				boolean result = StudentDao.insertStudentToDB(studentModel);
				if (result) {
					System.out.println("\nStudent is added Successfully !!!\n\n");
				} else {
					System.out.println("\nSomething went wrong try again !!!\n\n");
				}
				System.out.println(studentModel);

			} else if (c == 2) {
				// delete student
			} else if (c == 3) {
				// display student
			} else if (c == 4) {
				// EXIT
				break;
			} else {
				System.out.println("Invalid Option");
			}
		}

		System.out.println("Thank you for using my application \nSee you soon bye bye..!! ");
	}

}
