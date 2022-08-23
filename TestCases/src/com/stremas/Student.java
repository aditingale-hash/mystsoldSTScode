package com.stremas;

public class Student {
int id;
String name;
int no;
String city;
public Student(int id, String name, int no, String city) {
	super();
	this.id = id;
	this.name = name;
	this.no = no;
	this.city = city;
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
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", no=" + no + ", city=" + city + "]";
}

}
