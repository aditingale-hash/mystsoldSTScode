package com.casestudy.exception;

public class InsufficientFundsException extends Exception {
	private double amount;
	private double balance;
	public InsufficientFundsException (double amount,double balance )
	{       
		this.amount=amount;
		this.balance=balance;
		
	}
public String getMessage() {
	
		
		return "111111";
	}


}
