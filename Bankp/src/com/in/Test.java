package com.in;

public class Test {
public static void main(String[] args) {
	AA a=new AA();
	System.out.println(a.x);//5
	BB b=new BB();
	System.out.println(b.x);//10
	
	AA aa=new BB();//poly
	System.out.println(aa.x);//5
	aa.m1();
	
	
	
	aa.display();//display in a
//aa.display(7);//cf
	System.out.println(aa.compute());//10
	
}
}
class AA{
	
	int x=4;
	void m1() {
		
		System.out.println("m1 in a");
	
	}
	protected void display() {
		
		System.out.println("display in A");
		
	}
	

public int compute() {
	
	return 10;

}
}
class BB extends AA{
	int x=10;
	void m1() {
		
		System.out.println("m1 in B");
		
	}
	public void display(int x) {
		System.out.println("display in B");
		
	}
	public int compute(int x) {
		
		return 20;
		
		
	}
	
}