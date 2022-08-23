package StudentStudy;

public class B extends A{

	@Override
	public String computeGrade(int percent) {
		
		String grade; 
		
//		if(percent>75)
//			grade = "A+"; 
//		else
//		if(percent > 60)
//			grade = "A"; 
//		else
//		if(percent > 40)
//			grade ="B"; 
//		else
//			grade = "C";
		
		grade = percent>75? "A+" : percent > 60? "A" : percent > 40? "B": "C"; 
		return grade;
	}

} 
