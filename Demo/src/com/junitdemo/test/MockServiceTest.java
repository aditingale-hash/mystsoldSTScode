package com.junitdemo.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.junitdemo.service.InvalidMarkException;
import com.junitdemo.service.MockService;
import com.junitdemo.service.MyService;
import com.junitdemo.service.Product;

public class MockServiceTest {

	MockService mockservice;
	
	@BeforeClass
	public static void  initclass(){
		
	}
	@Before
	public  void init(){
		 mockservice = Mockito.mock(MockService.class);
	}
	@Test
   public void compTest(){
		Mockito.when(mockservice.comp(80)).thenReturn("A");
		Mockito.when(mockservice.comp(60)).thenReturn("B");
		Mockito.when(mockservice.comp(55)).thenReturn("C");
		Mockito.when(mockservice.comp(101)).thenReturn("invalid marks");
		Mockito.when(mockservice.comp(-101)).thenReturn("invalid marks");
	
	}
	@Test
	   public void computegrade()throws InvalidMarkException{
			Mockito.when(mockservice.comp(80)).thenReturn("A");
			Mockito.when(mockservice.comp(60)).thenReturn("B");
			Mockito.when(mockservice.comp(55)).thenReturn("C");
			Mockito.when(mockservice.comp(101)).thenThrow(InvalidMarkException.class);
			Mockito.when(mockservice.comp(-101)).thenThrow(InvalidMarkException.class);
		
		}
		
}
