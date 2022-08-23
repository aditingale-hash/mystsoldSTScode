package ExceptionTestCases;

public class Marks{

	public static void main(String[] args) {
		D d=new D();
		try {
			double f=d.compute(202,100);
			System.out.println(f);
		} catch(InvalidMarksException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
}
class D{

	public double compute(double marks,double total) throws InvalidMarksException {
		if(marks>total) 
			throw new InvalidMarksException("marks cannot be > total");
   if(marks<0) 
	   throw new InvalidMarksException("marks cannot be< zero");
   
   double percetage=(marks*100)/total;
   return percetage;
	}
	

}
class InvalidMarksException extends Exception{
	
	String message;

	public InvalidMarksException(String message) {
	
		this.message = message;
	}
	
public String getMessage() {
	return this.message;
	
}	
}