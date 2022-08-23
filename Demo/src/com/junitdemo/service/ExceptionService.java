package com.junitdemo.service;

public class ExceptionService {
	public int compute(int n1,int n2) {
		return n1/n2;
	}
public String computegrade(double marks) throws InvalidMarkException{
	if (marks>100)
		throw new InvalidMarkException("marks should be less than 100");
	
	if (marks<0)
		throw new InvalidMarkException("marks should be greater than 0");
		
	return marks>=70?"A":marks>=60?"B":"C";
	
		
}
}

