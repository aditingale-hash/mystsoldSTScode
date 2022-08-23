package ExceptionTestCases;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionTestCaseMarks {
	 @Test(expected= InvalidMarksException.class ) 
	 public void compute() throws InvalidMarksException {
		 D e=new D();
		 try {
			 Assert.assertEquals("marks cannot be< zero",e.compute(0,100));
		 }
		 catch(InvalidMarksException x){
			 x.getMessage();
		 }
		
	}
	}

