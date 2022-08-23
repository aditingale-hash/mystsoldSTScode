package com.testcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.testcase.EmployeeInfo.SortMethod;

public class Streamdemo{
public static void main(String[] args)
{
	EmployeeInfo a=new EmployeeInfo();
	
	Employee e1=new Employee("abc",2000);
	Employee e2=new Employee("ahods",204562);
	Employee e3=new Employee("autn",2523);
	List<Employee>k=new ArrayList<>(Arrays.asList(e1,e2,e3));	
	System.out.println(a.sort(k,SortMethod.BYNAME));
	System.out.println(a.sort(k,SortMethod.BYSALARY));
	System.out.println(a.isCharacterPresentIntAllNames(k, "A"));
  }
}
class Employee{
	String name;
	 double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
class EmployeeInfo{
	
	enum SortMethod
	{
		BYNAME,BYSALARY	
	}
	public List<Employee> sort(List<Employee>emps, final SortMethod method)
	{
		List<Employee> sortedList = new ArrayList<>();
		
			if(method.toString().equals("BYSALARY")) 
			{
						
				sortedList = emps.stream()
								.sorted(Comparator.comparingDouble(Employee :: getSalary))
									.collect(Collectors.toList());
			
			}
		  else if(method.toString().equals("BYNAME")) 
		  {
			
			sortedList = emps.stream().sorted(Comparator.comparing(Employee :: getName))
					.collect(Collectors.toList());
		
		}
			
    return sortedList;
    
	}
public boolean isCharacterPresentIntAllNames(Collection<Employee>entities, String character)
{	
		boolean isPresent = entities.stream()
							.allMatch(p->p.getName().toLowerCase().startsWith(character.toLowerCase()));
		
			return isPresent;
}
	
}