package com.p;
public class Project {
private int id;
private String name;
private int term;
private double premium;
private String avalibleFor;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int id, String name, int term, double premium,  String avalibleFor) {
	super();
	this.id = id;
	this.name = name;
	this.term = term;
	this.premium = premium;
	this.avalibleFor = avalibleFor;
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
public int getTerm() {
	return term;
}
public void setTerm(int term) {
	this.term = term;
}
public double getPremium() {
	return premium;
}
public void setPremium(double premium) {
	this.premium = premium;
}

public String getAvalibleFor() {
	return avalibleFor;
}
public void setAvalibleFor(String avalibleFor) {
	this.avalibleFor = avalibleFor;
}
@Override
public String toString() {
	return "Project [id=" + id + ", name=" + name + ", term=" + term + ", premium=" + premium + ", avalibleFor="
			+ avalibleFor + "]";
}



}
