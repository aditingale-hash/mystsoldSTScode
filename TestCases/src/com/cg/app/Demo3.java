package com.cg.app;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Details in 'roll:name:marks' pattern");
		String details = sc.nextLine();
		String result;
		
		String arr[] = details.split(":"); 	
		int roll = Integer.parseInt(arr[0]);
		String name = arr[1];
		int marks = Integer.parseInt(arr[2]);
		
		if(marks>500) {
			result="pass";
		}
		else {
			result="fail";
		}
			System.out.println("Student Roll is :" + roll);
			System.out.println("Student Name is : " + name);
			System.out.println("Student Marks is : " + marks);
			System.out.println("Student Result is : " + result);
			
	}
	}

