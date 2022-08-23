package com.interfacedemo;

public class B extends A {

	@Override
	public String computegrade(int percent) {
		// TODO Auto-generated method stub
		if(percent>75)
			return "A+";
		else if(percent>60)
			return "A";
		else if(percent>40)
			return "B";
		else if(percent<40)
			return "C";
		
		return null;
	}

}
