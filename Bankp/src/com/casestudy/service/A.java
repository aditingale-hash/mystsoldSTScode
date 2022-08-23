package com.casestudy.service;

import com.casestudy.beans.Customer;
import com.casestudy.main.Ops;

 abstract public class A implements Ops{

	@Override
	public void deposite(Customer c, double amount) {
		double temp=c.getBalance()+amount;
		c.setBalance(temp);
		
	}

	

}
