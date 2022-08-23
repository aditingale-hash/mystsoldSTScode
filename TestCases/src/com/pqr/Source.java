package com.pqr;
public class Source{

	public static void main(String[] args) throws Exception {
		Source a=new Source();
		System.out.println("for input age=19 and highestQualification=B.E");
		try {
			System.out.println(a.searchForjob(19,"B.E"));
		} catch (Noteligiblexception e) {
			System.out.println(e.getmessage());
		}
	}
	public String searchForjob(int age,String highestQualification) throws Noteligiblexception{
			if(age >=200 )
				throw new Noteligiblexception("The age entered is not typical for a human being");

		return CompanyJobRepositry.getjobprediction(age, highestQualification);
	}

}
class CompanyJobRepositry{
	static String getjobprediction(int age,String highestQualification) throws Noteligiblexception{
		
		String f= " ";
		if(age==19){
			throw new Noteligiblexception("your underage of any job");
		}
		else if(age>21 && highestQualification.equals("B.E")) {
				f="we have opining s for junior developer";
			}		
		else if(age>=26 && (highestQualification.equals("PHD")||highestQualification.equals("MS"))) {
				f="we have opining s for senior developer";		
		}
		else {
			f="we dont have any opnings for now";
		}
	return f;	
	}
	
}
class Noteligiblexception extends Exception{
	String message;

	public Noteligiblexception(String message) {
		super();
		this.message = message;
	}
	 public String getmessage() {
		 
		 return this.message;
	 }
}