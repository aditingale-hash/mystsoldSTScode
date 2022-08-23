package Casestudy1;

public class A implements Result{

	@Override
	public double computeResult(Student s) throws WrongmarkException,Invalidmark  {
		
		if(s.getMarks()>300)
		 throw new WrongmarkException();
		
		if(s.getMarks()<0)
		throw new Invalidmark();
			
			 double temp=s.getMarks();
			 double R=temp*100/Result.total;
				return R;
	}

}
