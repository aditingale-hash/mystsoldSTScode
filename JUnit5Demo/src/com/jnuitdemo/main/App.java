package com.jnuitdemo.main;

import com.junitdemo.service.MyService;

public class App {
	public static void main(String[] args) {
		MyService service = new MyService(); 
		int result = service.sum(5,10);
		System.out.println("Sum is " + result);
	}
}
