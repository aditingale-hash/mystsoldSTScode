package com.cg.main.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.main.model.Customer;
import com.cg.main.model.Product;
import com.cg.main.model.Vendor;




public class ProductService {
	  Scanner sc;
	   EntityManager entityManager = null;

		public ProductService(EntityManager entityManager) {
			this.entityManager=entityManager;
			sc = new Scanner(System.in);
		}

		public Product readProduct(Product product) {
			System.out.println("Enter product Name: ");
			String name = sc.next();
			product.setPname(name);

			System.out.println("Enter product price: ");
			double price = sc.nextInt();
			product.setPrice(price);
			
			System.out.println("Enter Vendor ID: ");
			int vendId = sc.nextInt();
			Vendor vendor = entityManager.find(Vendor.class, vendId);
			product.setVendor_vId(vendor);
			
			return product;
		}

		public List<Product> fetchAllProducts() {
			List<Product> list = entityManager.createQuery("select e from Product e", Product.class).getResultList();
			return list;
		}

		public void buyProduct(int cid, int pid) {
			// TODO Auto-generated method stub
			Customer customerObj=  entityManager.find(Customer.class, cid);
			Product ProductObj = entityManager.find(Product.class, pid);
			
			List<Product> list = customerObj.getProduct();
			list.add(ProductObj);
			
			customerObj.setProduct(list);
			
			entityManager.persist(customerObj);
			
		}

		public  List<Product> fetchProductByCustomerId(int cidval) {
			Query query = entityManager
					.createQuery("select p from Product p join p.customer v where v.id=:vid", Product.class);
			query.setParameter("vid", cidval);
			
			return query.getResultList();
		
		}

		public Product getProductById(int eid) {
			// TODO Auto-generated method stub
			 return entityManager.find(Product.class, eid);
		}

		public void deleteProduct(Product e) {
			entityManager.remove(e);
			
		}
}
