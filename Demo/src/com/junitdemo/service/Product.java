package com.junitdemo.service;

public class Product {
private String pname;
private double price;

public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product(String pname, double price) {
	super();
	this.pname = pname;
	this.price = price;
}
@Override
public String toString() {
	return "Product [pname=" + pname + ", price=" + price + "]";
}	
}
