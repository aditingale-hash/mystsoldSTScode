package com.junitdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.jnuitdemo.main.Product;

public class MyService {

	public List<Product> list = new ArrayList<>();
	
	public int sum(int i, int j) {
		return i+j;
	}
	
	public String computeGrade(int marks) {
		if(marks>100 || marks<0)
			return "invalid marks";
		return marks>70?"A":marks>60?"B":"C";
	}
	
	public String addProduct(Product p) {
		if(list.contains(p)) {
			return "product already present";
		}
		list.add(p);
		return "new product added";
	}
	
	public String removeProduct(Product p) {
		if(list.remove(p)) {
			return "product removed";
		}else {
			return "product does not exist";
		}
	}
	
	public int listSize() {
		return list.size();
	}
}









