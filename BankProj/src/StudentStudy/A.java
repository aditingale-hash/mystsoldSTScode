package StudentStudy;

abstract public class A implements Result{

	@Override
	public int computePercent(int marks) {
		int percent = (marks * 100) / Result.totalMarks; 
		return percent;
	}

}
