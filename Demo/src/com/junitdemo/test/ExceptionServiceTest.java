package com.junitdemo.test;

import java.rmi.AccessException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.junitdemo.service.ExceptionService;
import com.junitdemo.service.InvalidMarkException;

public class ExceptionServiceTest {
	
	ExceptionService  exceptionservice;
	
	@Before
	public void init() {
		exceptionservice=new ExceptionService();	
		
	}
	
    @Test(expected = ArithmeticException.class)
    public void ComputeTest(){
    	Assert.assertEquals(2, exceptionservice.compute(20,10));
   Assert.assertEquals(1, exceptionservice.compute(20,0));
    }
   @Test
   public void computegradeTest() throws InvalidMarkException {
	   Assert.assertEquals("A", exceptionservice.computegrade(80));
	   Assert.assertEquals("A", exceptionservice.computegrade(90));
	   Assert.assertEquals("C", exceptionservice.computegrade(50));
	   try {
		   
		   exceptionservice.computegrade(101);
		   
	   }catch(InvalidMarkException e) {
		   Assert.assertEquals("marks should be less than 100", e.getMessage());
		   
	   }
 try {  
		   exceptionservice.computegrade(-1);
		   
	   }catch(InvalidMarkException e) {
		   Assert.assertEquals("marks should be greater than 0", e.getMessage());
		   
	   }
   	   
   }
    
    @After
    public void after() {
    	exceptionservice=null;
    	
    }
}
