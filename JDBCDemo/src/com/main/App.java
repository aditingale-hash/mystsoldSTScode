package com.main;

import java.sql.SQLException;

import com.main.model.Student;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student(1,"harry","mumbai",24,1);
		
		DBConfig db = new DBConfig();
		 
			db.insertStudent(s1);
			System.out.println("Record Inserted...");
		  
	}
}
