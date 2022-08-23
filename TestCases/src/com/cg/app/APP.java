package com.cg.app;

import java.util.Scanner;

public class APP {
	private static Scanner sc;
	static Employee1 EmployeeService=new Employee1();
	public static void main(String[] args) {
		Employee1 s =new Employee1();
		    Demo1 db = new Demo1();
		   sc = new Scanner(System.in);
		   
	       System.out.println("Enter details");
	       System.out.println("Enter student name");
	       s.setName(sc.next());
	       System.out.println("Enter Adress");
	       s.setAddress(sc.next());
	       System.out.println("Enter salary");
	       s.setSalary(sc.nextInt());
	       db.insert(s);
	       System.out.println("RECORD INSERTED.........");
	       
	}

}
