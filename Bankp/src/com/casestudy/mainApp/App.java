package com.casestudy.mainApp;
import com.casestudy.beans.Customer;
import com.casestudy.exception.InsufficientFundsException;
import com.casestudy.exception.OverTheLimitAmountException;
import com.casestudy.service.B;
public class App {
	
	public static void main(String[] args) {
		Customer c1=new Customer("HP",4000);
		Customer c2=new Customer("NP",2000);
		
		B b=new B();
		b.deposite(c1, 200000);
		b.deposite(c2, 30000);
		
		try{
			b.withdraw(c1, 65000);
			b.withdraw(c2, 5000);
		   }
		catch(OverTheLimitAmountException e){
			System.out.println(e.getMessage());
		}
		catch(InsufficientFundsException e)
		{     System.out.println(e.getMessage());   }
		
		catch(RuntimeException e)
		{     System.out.println("12345677");   }
		finally {
			
			b=null;
		}
		System.out.println(c1);
		System.out.println(c2);
	}

}