package com.casestudy.main;

import com.casestudy.beans.Customer;
import com.casestudy.exception.InsufficientFundsException;
import com.casestudy.exception.OverTheLimitAmountException;

public interface Ops{
int limit=50000;
 void deposite(Customer c,double amount);
 void withdraw(Customer c,double amount) throws InsufficientFundsException, OverTheLimitAmountException;
}
