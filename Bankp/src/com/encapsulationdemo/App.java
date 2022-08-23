package com.encapsulationdemo;

public class App {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.getx());
		System.out.println(a.gety());
		
		a.setx(10);
		a.sety(20);
		a.m1();
		
		A a2=new A(10,20);
		a2.m1();
		
		System.out.println(a);
		System.out.println(a2);
	}

}

class A {
	
	
	private int x=5;
	private int y=10;
	
	A(){
		
		
	}
	
	A(int x,int y){
		
		this.x=x;
		this.y=y;
		
	}
	public void m1() {

		System.out.println(x+y);
		
}
public int getx() {
	
return x;
}
public int gety() {
	
return y;
}

public void setx(int x)
{
this.x=x;	
}

public void sety(int y)
{
this.y=y;	
}


public String toString() {
	
return"[x= "+ x + "y= " +y +"]";
	
}
}