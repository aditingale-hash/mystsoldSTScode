package com.junitdemo.test;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.jnuitdemo.main.Product;
import com.junitdemo.service.MyService;

public class MyServiceTest {

	MyService service;
	MyService service1;
	Product p;
	Product p1;
	
	@BeforeClass
	public static void initClass() {
		 
	}
	
	@Before
	public void init() {
		service = new MyService();
		p=new Product("Oppo",23000);
		p1=new Product("Samsung",21000);
		service1 = mock(MyService.class);
	}
	
	 @Test
	public void sumTest() {
		Assert.assertEquals(4, service.sum(2,2));
		Assert.assertEquals(10, service.sum(5,5)); 
		Assert.assertEquals(0, service.sum(-2,2));
		Assert.assertEquals(-4, service.sum(-2,-2));
		 
		Mockito.when(service1.sum(3,4)).thenReturn(7);
	}
	 
	 @Test
	 public void computeGradeTest(){ 
		 Assert.assertEquals("A", service.computeGrade(80));
		 Assert.assertEquals("B", service.computeGrade(65));
		 Assert.assertEquals("C", service.computeGrade(55));
		 Assert.assertEquals("invalid marks", service.computeGrade(101));
		 Assert.assertEquals("invalid marks", service.computeGrade(-1));
	 }
	 
	 @Test
	 public void addProductTest() { 
		 Assert.assertEquals(0, service.list.size());
		 Assert.assertEquals("new product added", service.addProduct(p));
		 Assert.assertEquals(1, service.list.size());
		 Assert.assertEquals("product already present", service.addProduct(p));
		 Assert.assertEquals(1, service.list.size());  
		 Assert.assertEquals("new product added", service.addProduct(p1));
		 Assert.assertEquals(2, service.list.size());
	 }
	 
	 @Test
	 public void removeProductTest() {
		 Assert.assertEquals(0, service.list.size());
		 service.addProduct(p);
		 Assert.assertEquals(1, service.list.size());
		 Assert.assertEquals("product does not exist",service.removeProduct(p1));
		 service.addProduct(p1);
		 Assert.assertEquals(2, service.list.size());
		 Assert.assertEquals("product removed",service.removeProduct(p1));
		 Assert.assertEquals(1, service.list.size());
	 }
	 
	 @Test
	 public void listSize() {
		 Assert.assertEquals(0, service.listSize());
		 service.addProduct(p);
		 service.addProduct(p1);
		 Assert.assertEquals(2, service.listSize());
	 }
	 
	 @After
	 public void after() {
		  service=null;
		  p=null;
		  p1=null;
	 }
	 
	 @AfterClass
	 public static void afterClass() {
		 
	 }
}
