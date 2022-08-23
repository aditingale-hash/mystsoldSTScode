package Casestudy1;

public class App {
	public static void main(String[] args) {
		Student s=new Student(50,"aditi");
		Student s1=new Student(-852,"aditi");
		
		A a=new A();
		try {
		double D=a.computeResult(s);
		System.out.println("your marks:"+D);
		double k=a.computeResult(s1);
		System.out.println("your marks:"+k);
		}
		catch(WrongmarkException e) {
			
			System.out.println("lesss than 300");
		}
		catch(Invalidmark e) {
			System.out.println("invalid marks less than 0");
		}
	}
}
