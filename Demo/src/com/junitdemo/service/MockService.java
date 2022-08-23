package com.junitdemo.service;

public class MockService {
	public String comp(int marks) {
		// TODO Auto-generated method stub
		if(marks>100||marks<0)
		{
			return "invalid marks";
			
		}
		return marks>=70?"A":marks>=60?"B":"C";
	}
	
	public String computegrade(double marks) throws InvalidMarkException{
		if (marks>100)
			throw new InvalidMarkException("marks should be less than 100");
		
		if (marks<0)
			throw new InvalidMarkException("marks should be greater than 0");
			
		return marks>=70?"A":marks>=60?"B":"C";
		
			
	}
}
