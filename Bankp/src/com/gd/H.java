package com.gd;

public class H {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		
	}

}
class A{
	
	void m1() {
		
		System.out.println("A");
	}
	final void m2() {
		System.out.println("B");
	}
	
}
class B extends A{
	//void m2() {System.out.println("c");}
	
	final int A=1;
     //A=3;
	
	
}