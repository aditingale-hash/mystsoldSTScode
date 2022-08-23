package com.mainj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.stu.Student;

public class StudentService {

	public List<Student> sortByAge(List<Student> list) 
	{
	 Collections.sort(list,new A());
		return list;
	}
	
	

}
class A implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getAge()-s2.getAge();
	}
	
	
}

