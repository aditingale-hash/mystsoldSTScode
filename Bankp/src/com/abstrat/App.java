package com.abstrat;

public class App {
	
	public static void main(String[] args) {
	N n=new N();
	n.invalid();
	n.debit();
	n.credit();
		
	}

}
abstract class A{
	
	void credit() {
		
		System.out.println("credit");
	}
	abstract void debit();
	abstract void invalid();
	
	
}
 abstract class V extends A{
	 void debit() {
		 
	System.out.println("debit");	 
		 
	 }
	
	
}
 class N extends V{
	 
	 void invalid() {
		 
		 System.out.println("invalid");
		 
	 }
	 
 }