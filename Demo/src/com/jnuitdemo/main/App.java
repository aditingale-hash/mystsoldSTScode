package com.jnuitdemo.main;

import com.junitdemo.service.MyService;

public class App {
public static void main(String[] args) {
	MyService s=new MyService();
	int m =s.sum(5,10);
	System.out.println("sum is:" + m);
}
}
