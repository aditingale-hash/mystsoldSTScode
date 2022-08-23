package com.cg.main.service;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.cg.main.model.Customer;


public class CustomerService {
   Scanner sc;
   EntityManager entityManager = null;

	public CustomerService(EntityManager entityManager) {
		this.entityManager=entityManager;
		sc = new Scanner(System.in);
	}

	public  Customer readCustomerInput(Customer customer) {
		
		System.out.println("Enter Customer Name: ");
		String name = sc.next();
		customer.setName(name);

		System.out.println("Enter Employee age: ");
		int age = sc.nextInt();
		customer.setAge(age);

		System.out.println("Enter cutomer City: ");
		String city = sc.next();
		customer.setCity(city);
		return customer;
	}

	public Customer getCustomerById(int eid) {
		// TODO Auto-generated method stub
		return entityManager.find(Customer.class, eid);
	}

	public void updateCustomer(Customer e) {
		entityManager.persist(e);
		
	}

	public void deleteCustomer(Customer e) {
		// TODO Auto-generated method stub
		entityManager.remove(e);
	}

	public List<Customer> fetchAllCustomers() {
		List<Customer> list = entityManager.createQuery("select c from Customer c", Customer.class).getResultList();
		return list;
	
	}

	public List<Customer> fetchPCustomerByProductId(int pidval) {
		Query query = entityManager
				.createQuery("select p from Customer p join p.product v where v.id=:vid", Customer.class);
		query.setParameter("vid", pidval);
		
		return query.getResultList();
	}


}
