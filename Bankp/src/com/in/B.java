package com.in;

public class B extends A {
	

	public int withdraw(int balance, int amount) {
		// TODO Auto-generated method stub
		balance=balance- amount;
		return balance;
	}
	public int deposite(int balance, int amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		
		return balance;
	}
}
