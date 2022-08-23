package ExceptionTestCases;

public class Source{
	
   public String handleException(Activity a) throws Exception {
	   
		if(a.getString1()==null) {
			throw new NullPointerException("Null values found");
		}
		if(a.getString2()==null) {
			throw new NullPointerException("Null values found");
		}
		if(!(a.getOperator().equals("+")||a.getOperator().equals("-"))) {
		       throw new Exception(a.getOperator());
	}else{
		throw new NullPointerException("Null values found");	
	}
   }
	
	public String doOperation(Activity a){
		String String1 = a.getString1();
	switch(a.getOperator()) { 
	case "+":
		 String1 = (a.getString1().concat(a.getString2()));
		break;
		
	case "-":
		a.setString1( a.getString1().concat(a.getString2().replace(a.getString2(),"")));
		
		
	}
	return String1;
}
}
	

