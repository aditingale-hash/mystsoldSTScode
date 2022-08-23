package com.collecion;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterDemo {
	public static void main(String[] args) throws Exception , ExecutionException{
		
		ExecutorService executoreservice =Executors.newSingleThreadExecutor();
		StudentService stu=new StudentService();
		Future<Student> res=executoreservice.submit(stu);
		System.out.println(res.get());
		
	}

}

class StudentService implements Callable<Student> {

	public Student getStudent() throws Exception{
		return new Student("harry potter", 89);
		
	}
	@Override
	public Student call() throws Exception {
		return getStudent();
	}


}
class Student{
	
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}

