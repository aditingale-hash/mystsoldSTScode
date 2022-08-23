package com.stu;

public class Student {
	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", dept_id=" + dept_id
				+ "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public Student(int id, String name, String city, int age, int dept_id) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.dept_id = dept_id;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String city;
	private int age;
	private int dept_id;
	
	


}
