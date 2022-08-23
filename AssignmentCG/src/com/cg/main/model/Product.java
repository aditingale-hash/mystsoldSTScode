package com.cg.main.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int pid;
	
	@Column(name = "pname", nullable = false)
	private String pname;
	
	private double price;
	
	@ManyToMany(mappedBy = "product")
   private List<Customer> customer; 
	
	@OneToOne
	private Vendor vendor;
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
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

	public Vendor getVendor_vId() {
		return vendor;
	}
	public void setVendor_vId(Vendor vendor) {
		// TODO Auto-generated method stub
		this.vendor=vendor;
		
	}
	
}
