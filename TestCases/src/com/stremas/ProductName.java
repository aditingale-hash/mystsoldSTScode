package com.stremas;
public class ProductName {
int id;
String name;
double price;
String model;
public ProductName(int id, String name, double price, String model) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.model = model;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", model=" + model + "]";
}

}
