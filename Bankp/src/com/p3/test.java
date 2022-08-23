package com.p3;

public class test {
	public static void main(String[] args) {
		C c=new C();
		c.x=10;
		c.y=20;
		C c1=new C();
		System.out.println(c.x);//10
		System.out.println(c1.x);//5
		System.out.println(c.y);//20
		System.out.println(c1.y);//20	
	}
}
class C{
	int x=5;
	static int y=10;
		
}