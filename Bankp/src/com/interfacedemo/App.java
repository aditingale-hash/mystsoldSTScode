package com.interfacedemo;

public class App {
	public static void main(String[] args) {
		
	Student s=new Student();
	s.name="harry";
	s.mark=100;
	
	B b=new B();
	int percent=b.computepercent(s.mark,200);
	System.out.println(percent);
	
	String grade=b.computegrade(percent);
	System.out.println(grade);
	
	}
}
