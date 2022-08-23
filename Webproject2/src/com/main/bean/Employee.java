package com.main.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    @NotBlank
    @Pattern(regexp = "[a-zA-Z ]+",message = "Name can only contain alphabets")
	private String name;
     @Size(min=5,max = 10,message = "city should be between 5 to 10 characters")
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
	
}
