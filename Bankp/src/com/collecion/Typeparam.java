package com.collecion;

public class Typeparam {
	public static void main(String[] args) {
		X x=new X();
		Integer[] i=new Integer[] {2,3,4,5,6};
		Float[] f=new Float[] {2f,3f,4f,5f,6f};
		String[] s=new String[] {"abc","bca"};
		
	}
	
	
}

class X{
	<T> void display(T[] t) {

		for(T temp:t) 
		{
		System.out.println(temp);	
		}
		System.out.println("  ");
		}

	
	
}