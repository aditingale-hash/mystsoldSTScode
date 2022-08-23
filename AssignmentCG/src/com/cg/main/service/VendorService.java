package com.cg.main.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.main.model.Product;
import com.cg.main.model.Vendor;



public class VendorService {
 
	Scanner sc;
	   EntityManager entityManager = null;

		public VendorService(EntityManager entityManager) {
			this.entityManager=entityManager;
			sc = new Scanner(System.in);
		}

		public void populate() {
			Vendor v1 = new Vendor();
			v1.setVcity("pune");
			v1.setVname("Aman");
			entityManager.persist(v1);
			Vendor v2 = new Vendor();
			v2.setVcity("mumbai");
			v2.setVname("Ram");
			entityManager.persist(v2);
			
		}

		public List<Product> fetchproductByVendorId(int vidval) {
			Query query= entityManager
					.createQuery("select p from Product p join p.vendor v where v.id=:vid", Product.class);
			query.setParameter("vid", vidval);
			List<Product> list=query.getResultList();
			return list;
			
		}
}
