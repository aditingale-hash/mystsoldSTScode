package com.junitdemo.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.nio.InvalidMarkException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.junitdemo.service.ExceptionService;
import com.junitdemo.service.InvalidMarksException;

public class ExceptionServiceTest {

	ExceptionService exceptionService; 
	
	@Before
	public void init() {
		exceptionService = new ExceptionService();
	}
	
	@Test(expected = ArithmeticException.class)
	public void computeTest() {
		Assert.assertEquals(2, exceptionService.compute(10, 5));
		Assert.assertEquals(2, exceptionService.compute(10, 0));
	}
 
	@Test 
	public void computeGradeTest() throws InvalidMarksException{
		 Assert.assertEquals("A", exceptionService.computeGrade(80));
		 Assert.assertEquals("B", exceptionService.computeGrade(65));
		 Assert.assertEquals("C", exceptionService.computeGrade(55));

		 try {
			 	exceptionService.computeGrade(101);
		 }
		 catch(InvalidMarksException e) {
			 Assert.assertEquals("marks should be less than 100", e.getMessage());
		 }
		 try {
			 exceptionService.computeGrade(-1);
		 }
		 catch(InvalidMarksException e) {
			 Assert.assertEquals("marks should be greater than 0", e.getMessage());
		 }
	}
	
	 
	 @After
	 public void after() {
		 exceptionService=null;
	 }
}
