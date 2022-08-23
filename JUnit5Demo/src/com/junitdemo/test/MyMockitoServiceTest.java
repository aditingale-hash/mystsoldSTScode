package com.junitdemo.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.junitdemo.service.InvalidMarksException;
import com.junitdemo.service.MyMockitoService;

public class MyMockitoServiceTest {

	MyMockitoService myMockitoService;
	@Before
	public void initTest() {
		myMockitoService= Mockito.mock(MyMockitoService.class);
	}
	
	@Test
	public void computeGradeTest() {
		Mockito.when(myMockitoService.computeGrade(80)).thenReturn("A");
		Mockito.when(myMockitoService.computeGrade(65)).thenReturn("B");
		Mockito.when(myMockitoService.computeGrade(55)).thenReturn("C");
		 
		Mockito.when(myMockitoService.computeGrade(155)).thenReturn("invalid marks");
		Mockito.when(myMockitoService.computeGrade(-10)).thenReturn("invalid marks");
	}
	
	@Test
	public void computeTest() throws InvalidMarksException {
		Mockito.when(myMockitoService.compute(80)).thenReturn("A");
		Mockito.when(myMockitoService.compute(65)).thenReturn("B");
		Mockito.when(myMockitoService.compute(55)).thenReturn("C");
		Mockito.when(myMockitoService.compute(155)).thenThrow(InvalidMarksException.class);
		Mockito.when(myMockitoService.compute(-10)).thenThrow(InvalidMarksException.class);
	}
}




