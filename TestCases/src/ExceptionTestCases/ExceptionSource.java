package ExceptionTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionSource {
	@Test
	public void handleException() {
		Source s=new Source();
	    Activity a= new Activity(null, "pqr", "+");
	    try {
	    	s.handleException(a);
	    }
	    catch(Exception e) {	
	    	assertEquals("Null values found",e.getMessage());	
	    }
	    
	     a= new Activity("abc",null, "+");
	    try {
	    	s.handleException(a);
	    }
	    catch(Exception e) {	
	    	assertEquals("Null values found",e.getMessage());	
	    }
	    
	    a= new Activity("abc","pqr", "*");
	    try {
	    	s.handleException(a);
	    }
	    catch(Exception e) {	
	    	assertEquals("*",e.getMessage());	
	    }
	    
	}
	@Test
	public void doOperation() {
		
		Activity a=new Activity("hello","Wrold","+");
		Source s=new Source();
		Assert.assertEquals("helloWrold",s.doOperation(a));
		
		 a=new Activity("hello","Wrold","-");
			Assert.assertEquals("hello",s.doOperation(a));
				
		
		
	}
	}
