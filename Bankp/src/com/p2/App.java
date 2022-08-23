package com.p2;
//import com.p1.A;
//import com.p1.C;
//import com.p2.B;
import com.p3.Cust;
//import com.p3.D;

public class App {
public static void main(String[] args) {
	/*
	A a=new A();
	B b=new B();
	C c=new C();
	D d=new D();
	
	a.display();
	b.display();
	c.display();
	d.display();
	
	int percent=a.sum(83,100);
	System.out.println(percent);
	
	a.m1(12,4);
	int val=a.m2();
	System.out.println(val);
	
	B b=new B();
	B b1= new B();
	System.out.println(b.i);
	b1.i=10;
	System.out.println(b1.i);
*/
	
	Cust c1=new Cust();
	c1.balance=5000;
	c1.balance=c1.deposite(1000);
	System.out.println(c1.balance);
	Cust c2=new Cust();
	c2.balance=6000;
	c2.balance=c1.deposite(1000);
	System.out.println(c2.balance);
	
	
	
}
}
