package com.junitdemo.service;

import java.util.ArrayList;
import java.util.List;

public class MyService {
	
	public List<Product> list=new ArrayList<>();

public int sum(int i, int j) {
	// TODO Auto-generated method stub
	return i+j;
}

public String comp(int marks) {
	// TODO Auto-generated method stub
	if(marks>100||marks<0)
	{
		return "invalid marks";
		
	}
	return marks>=70?"A":marks>=60?"B":"C";
}
public String addproduct(Product p) {
	if (list.contains(p)) {
		
		return"product already exist";		
	}
	list.add(p);
	return"new product added";
	
}
public String removeProduct(Product p) {
	if(list.remove(p)) {
		return "product removed";
	}else {
		return "product does not exist";
	}
	
}

public int listSize() {
	List<Product> list = null;
	return list.size();
}


}
