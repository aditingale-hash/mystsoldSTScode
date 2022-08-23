
package com.junitdemo.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junitdemo.service.MyService;
import com.junitdemo.service.Product;



public class MyServiceTest {
	MyService service;
	Product p;
	Product p1;
	
	@BeforeClass
	public static void  initclass(){
		
	}
	
	@Before
	public  void init(){
         service = new MyService();
		 p=new Product("oppo",2300000);
		   p1=new Product("samsung",2500000);
	}
	
	
	@Test
	public void sumTest() {	
	MyService service = new MyService();
		Assert.assertEquals(4,service.sum(2, 2));
		Assert.assertEquals(10,service.sum(5, 5));
		Assert.assertEquals(-4,service.sum(-2,-2));
		Assert.assertEquals(0,service.sum(0, 0));
	}
	
	@Test
	public void compTest() {
		
		MyService service = new MyService();
		Assert.assertEquals("A",service.comp(70));
		Assert.assertEquals("B",service.comp(60));
		Assert.assertEquals("C",service.comp(30));
		Assert.assertEquals("A",service.comp(85));
	}
	
	@Test
	public void addproductTest() {
		MyService service = new MyService();
		Product p=new Product("oppo",2300000);
		Assert.assertEquals(0,service.list.size());
		Assert.assertEquals("new product added",service.addproduct(p));
		Assert.assertEquals(1,service.list.size());
		Assert.assertEquals("product already exist",service.addproduct(p));
		Product p1=new Product("samsung",2400000);
		Assert.assertEquals("new product added",service.addproduct(p1));
		Assert.assertEquals(2,service.list.size());
			
	}
	@Test
	public void removeProductTest() {
		MyService service = new MyService();
		Product p=new Product("oppo",2300000);
		Assert.assertEquals(0,service.list.size());
		service.addproduct(p);
		Assert.assertEquals(1,service.list.size());
		Assert.assertEquals("product removed",service.removeProduct(p));
		Assert.assertEquals(0,service.list.size());
		Assert.assertEquals("product does not exist",service.removeProduct(p));
		Product p2=new Product("samsung",2500000);
		service.addproduct(p2);
		Assert.assertEquals(1,service.list.size());
		Product p3=new Product("vivo",2400000);
		service.addproduct(p3);
		Assert.assertEquals(2,service.list.size());
		
	}
	
	@Test
	public void listSize() {
		MyService service = new MyService();
		Assert.assertEquals(0,service.list.size());
		service.addproduct(p);
		service.addproduct(p1);
		Assert.assertEquals(2,service.list.size());
	}
	
@After
public void after() {
	
	
	service = null;
	p = null;
p1 = null;

}
}