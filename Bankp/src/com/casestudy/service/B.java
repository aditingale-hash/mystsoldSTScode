package com.casestudy.service;

import com.casestudy.beans.Customer;
import com.casestudy.exception.InsufficientFundsException;
import com.casestudy.exception.OverTheLimitAmountException;
import com.casestudy.main.Ops;

public class B extends A{
	@Override
	public void withdraw(Customer c, double amount) throws InsufficientFundsException, OverTheLimitAmountException{
		if (amount>c.getBalance())
		 {throw new InsufficientFundsException(amount, amount);}
		
		if (amount>Ops.limit)
			{throw new OverTheLimitAmountException();}
		
		 double temp = c.getBalance()-amount;
		c.setBalance(temp);
		
		
	}


}
