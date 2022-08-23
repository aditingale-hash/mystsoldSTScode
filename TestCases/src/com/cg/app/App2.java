package com.cg.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		App2 r=new App2();
		List<Employee2> list= new ArrayList<>();
		Employee2 e=new Employee2();
		Employee2 e1=new Employee2(1,"Aditi","pune",4000);
		Employee2 e2=new Employee2(2,"Viashnavi","pune",4000);
		Employee2 e3=new Employee2(3,"Rohit","mumbai",4000);
		Employee2 e4=new Employee2(4,"Abhi","goa",700);
		Employee2 e5=new Employee2(5,"Sam","mumbai",10000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println(r.removeDuplicateEmployee(list));
		
	}
	
	public List<Employee2> removeDuplicateEmployee(List<Employee2> employees){
		
		List<Employee2> unique = employees.stream()
                .distinct()
                .collect(Collectors.toList());

		return unique;
	
		 
		
		
	}	

}
