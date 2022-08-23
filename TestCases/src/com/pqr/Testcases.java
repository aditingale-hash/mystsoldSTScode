package com.pqr;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class Testcases {
@Test
public void searchForjob() throws Noteligiblexception {
	
	 Source e=new Source();
	 try {
	    	e.searchForjob(202, "B.E");
	    }
	    catch(Noteligiblexception x) {	
	    	assertEquals("The age entered is not typical for a human being",x.getmessage());	
	    }
	 
	
}
@Test
public void getjobprediction() throws Noteligiblexception {
	
	CompanyJobRepositry b=new CompanyJobRepositry();
	 try {
	    	b.getjobprediction(19, "B.E");
	    }
	    catch(Noteligiblexception x) {	
	    	assertEquals("your underage of any job",x.getmessage());	
	    }
	 
	 try {
	    	b.getjobprediction(29, "MS");
	    }
	    catch(Noteligiblexception x) {	
	    	assertEquals("we have opining s for senior developer",x.getmessage());	
	    }
	 try {
	    	b.getjobprediction(29, "ME");
	    }
	    catch(Noteligiblexception x) {	
	    	assertEquals("we dont have any opnings for now",x.getmessage());	
	    }
}

}
