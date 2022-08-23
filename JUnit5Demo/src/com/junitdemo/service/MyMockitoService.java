package com.junitdemo.service;

public class MyMockitoService {

	public String computeGrade(int marks) {
		if(marks>100 || marks<0)
			return "invalid marks";
		return marks>70?"A":marks>60?"B":"C";
	}
	
	public String compute(int marks) throws InvalidMarksException{
		if(marks>100)
			throw new InvalidMarksException("marks should be less than 100");
		if(marks<0)
			throw new InvalidMarksException("marks should be more than 0");
		
		return marks>70?"A":marks>60?"B":"C";
	}
}
