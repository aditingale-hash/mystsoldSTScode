package com.testcases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

 public class App {
	public static void main(String[] args) {
			
	List< Candidate> list= new ArrayList<>();
	
	getCount a= new getCount();
	AvgAge w=new AvgAge();
	dept b= new dept();
	Youngest y=new Youngest();
	list.add(new Candidate(1,"harry potter",23,"male","comp",2018,230000));
	list.add(new Candidate(2,"harry potter",23,"male","comp",2000,230000));
	list.add(new Candidate(3,"harry1",22,"male","IT",2018,2301));
	list.add(new Candidate(4,"harry2",20,"male","IT",2000,23015));
	list.add(new Candidate(5,"Jane",22,"female","comp",2000,23014));
	list.add(new Candidate(6,"Sunny",22,"male","IT",2018,2301));
	list.add(new Candidate(7,"harry4",28,"male","IT",2018,2301));
	list.add(new Candidate(8,"harry6",20,"male","IT",2018,2987));
	list.add(new Candidate(9,"sunny1",22,"male","IT",2018,2301));
	
	System.out.println(a.getCount(list));
	System.out.println(w.AvgAge(list));
	System.out.println(b.dept(list));
	System.out.println(y.getYoungestDetails(list));
}
}
class Candidate{

	int id;
	 String name;
	 int age;
   String gender; 
   String department;
	int yearOfJoining;
	double salary;
	public Candidate(int id, String name, int age, String gender, String department, int i, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = i;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	

	
}
 class getCount{
	
	public HashMap<String,Long> getCount(List<Candidate>list) {
		List<Candidate> listmale=new ArrayList<>();
		List<Candidate> listfemale=new ArrayList<>();
		for(Candidate c :list) {
			if(c.getGender().toUpperCase().equals("MALE")) {
			listmale.add(c);
			}
			else
				{if(c.getGender().toUpperCase().equals("FEMALE")) {
					listfemale.add(c);
				
				}
			}
		
		}
		long a=listmale.size();
    	long b=listfemale.size();  
		HashMap<String, Long> map = new HashMap<>();
		map.put("male",a);
		map.put("female",b);
	
		return map;		
	}	

	}
	
	class AvgAge{
		long f=0;
		long f1=0;
		long m1=0;
		long m=0;
		
		public HashMap<String,Long> AvgAge(List<Candidate>list)	{
			
			for(Candidate c :list) {
				if(c.getGender().toUpperCase().equals("FEMALE")) {
				f++;
				f1=f1+c.getAge();
				 
				}
				else
					{if(c.getGender().toUpperCase().equals("MALE")) {
						m++;
						m1=m1+c.getAge();
					
					}
				}
			
			}
			
	    	long b=m1/m;
	    	long a=f1/f;
			HashMap<String, Long> map = new HashMap<>();
			map.put("male",b);
			map.put("female",a);
		
			return map;		
		}	
						
		}
		
	class dept{	
		
		Long t=0l;
		Long e=0l;
	public HashMap<String,Long> dept(List<Candidate>list) {
		for(Candidate c :list) {
			if(c.getDepartment().toUpperCase().equals("COMP")) 	
		     e++;
			else if(c.getDepartment().toUpperCase().equals("IT")) 
					t++;
	
		
		}
		 
		HashMap<String, Long> map = new HashMap<>();
		map.put("COMP",e);
		map.put("IT",t);
	
		return map;		
	}	
	
	
	}
	
	class Youngest{
	
	static Candidate getYoungestDetails(List<Candidate> list) {
		
		List<Candidate> listY=new ArrayList<>();
		Collections.sort(list, new Comparator<Candidate>() {
	        public int compare(Candidate p1, Candidate p2) {
	            return p1.getAge() - p2.getAge();
	        }
	    });
		
	   
		return list.get(0);
	}


	
	}