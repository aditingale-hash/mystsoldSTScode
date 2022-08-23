package com.testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App2 {
	public static void main(String[] args) {
		Sort1 q=new Sort1();
		Sort2 f= new Sort2();
		Sort3 g=new Sort3();
		H r=new H();
		AvgSalary t=new AvgSalary();
		List<Employee> list= new ArrayList<>();
		Employee e1=new Employee(1,"XYZ",5000);
		Employee e2=new Employee(2,"ABC",6000);
		Employee e3=new Employee(3,"RTY",2000);
		Employee e4=new Employee(4,"MNB",7000);
		Employee e5=new Employee(5,"MNV",1000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
	System.out.println(	q.getSorted(list));
	System.out.println(f.getSortedSalary(list));
	System.out.println(g.findEmployeeMax(list));
	System.out.println("Avg salary"+t.FindAvgSalaries(list));
	System.out.println(r.listWithChar(list, "A"));
	}

}
class Employee{
	
	int id;
	 String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
class Sort1{
	
	public Optional<List<Employee>> getSorted(List<Employee>list){
		
		Collections.sort(list,new B());
		return Optional.of(list);
	
	}	
}
class B implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int y=e1.getName().compareTo( e2.getName());
		return y;
		
	}

}
class Sort2{
	
	public Optional<List<Employee>> getSortedSalary(List<Employee>list){
		
		Collections.sort(list,new C());
		return Optional.of(list);
	
	}	
}
class C implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		// TODO Auto-generated method stub
	 return (int) (e1.getSalary()-e2.getSalary());
	}
}
class Sort3{
	
	public Optional<com.testcases.Employee> findEmployeeMax(List<Employee>list){
		
		Collections.sort(list,new D());
		return Optional.of(list.get(0));
	
	}	
}
class D implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
	
	 return (int) (e2.getSalary()-e1.getSalary());
	}
}
class AvgSalary{
	double f=0;
	double f1=0;
	
	public double FindAvgSalaries(List<Employee>list)	{
		
		for(Employee c:list) {
			f =c.getSalary();
			f++;
			f1=f1+c.getSalary();
			 
			}
		double a=f1/f;
		return a;	
		}
	
		
	}	
					
class H{
	
	List<Employee> list3=new ArrayList<>();
	List <Employee> listWithChar(List <Employee> list,String ch){
		for(Employee i:list) {
			if(i.getName().startsWith(ch)) {
				
				list3.add(i);
					
			}
			
			
			
		}
		
		return list3;
		
		
		
		
		
		
	}
	
	
	
}