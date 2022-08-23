package com.cg.main.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
private int id;
	
@Column(name = "cname", nullable = false)
private String name;

private int age;

private String city;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
		name = "customer_product", 
		joinColumns = @JoinColumn(name="customer_id"),
		inverseJoinColumns = @JoinColumn(name="product_id") )
private List<Product> product;

public Customer(int id, String name, int age, String city) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.city = city;
}

public Customer() {
	// TODO Auto-generated constructor stub
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public List<Product> getProduct() {

	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
}
