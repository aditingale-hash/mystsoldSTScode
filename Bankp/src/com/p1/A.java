package com.p1;

public class A {
	int i,j;
	
	 public void display() {
	System.out.println("A");
	
	
}

	public int sum(int i, int j) {
		int c=(i*100)/(i+j);
		return c;
	}
	public void m1(int i, int j) {
		this.i=i;
		this.j=j;
		// TODO Auto-generated method stub
		
	}

	public int m2() {
		// TODO Auto-generated method stub
		return this.i+this.j;
	}

	}