package StudentStudy;

public class App {
	public static void main(String[] args) {
		Student s = new Student(); 
		s.name="harry potter";
		s.marksSecured=70; 
		
		B b=new B();
		int percent = b.computePercent(s.marksSecured);
		System.out.println("Your percentage is " + percent);
		
		String grade = b.computeGrade(percent);
		System.out.println("Your Grade is " + grade);
	}
}
