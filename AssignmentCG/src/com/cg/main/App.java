package com.cg.main;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.cg.main.model.Customer;
import com.cg.main.model.Product;
import com.cg.main.service.CustomerService;
import com.cg.main.service.ProductService;
import com.cg.main.service.VendorService;

public class App {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		EntityManagerFactory entityFactory = null;
		
		EntityManager entityManager = null;
		
		EntityTransaction transaction = null;
	
	
		try {
		entityFactory = Persistence.createEntityManagerFactory("cgdb1");
		entityManager = entityFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		  
		
   CustomerService customerService = new CustomerService(entityManager);
		VendorService vendorService=new VendorService(entityManager);
		 ProductService productService = new ProductService(entityManager);
		sc = new Scanner(System.in);
		while(true) {
			transaction.begin();
			System.out.println("----Customer Operations----");
			System.out.println("1. ADD Customer and product ");
			System.out.println("2. Populate vendor ");
			System.out.println("3. update customer ");
		    System.out.println("4. delete customer record(Cascading all) ");
			System.out.println("5. display customers");
			System.out.println("6. display Products");
			System.out.println("7. Allow customer buy products");
			System.out.println("8. List of products by vendor");
			System.out.println("9. product information by Customer");
			System.out.println("10. Customer information by product");
			System.out.println("11. Process refund(delete from relationship table) ");
			System.out.println("0. exit");
			int input = sc.nextInt();
			if(input == 0) {
				transaction.commit();
				break;
			}
			switch(input) {
			case 1: 
				Customer customer = new Customer();
				customer = customerService.readCustomerInput(customer);
				entityManager.persist(customer);
				System.out.println("customer inserted in DB.");
				
				
				Product product=new Product();
				product=productService.readProduct(product);
				entityManager.persist(product);
				System.out.println("product inserted in DB.");
				transaction.commit();
				break;
				
		case 2:
				vendorService.populate();
			System.out.println("vendor added..");
			transaction.commit();
			break;
			
			
			case 3: 
				System.out.println("Enter ID of customer you want to update:");
				int eid = sc.nextInt();
				Customer e = customerService.getCustomerById(eid);
				if(e == null)
					throw new RuntimeException("Invalid ID");
				
				e =customerService.readCustomerInput(e);
				customerService.updateCustomer(e);
				System.out.println("Customer Info updated...");
				transaction.commit();
				break;
				
			case 4:
				System.out.println("Enter ID of customer you want to delete:");
				eid = sc.nextInt();
				e = customerService.getCustomerById(eid);
				if(e == null)
					throw new RuntimeException("Invalid ID");
				customerService.deleteCustomer(e);
				System.out.println("Customer deleted from DB...");
				transaction.commit();
				break;
				
			case 5:
				List<Customer> list = customerService.fetchAllCustomers();
				System.out.println("------ All Customer Details ----\n");
				for(Customer c: list) {
					System.out.print("Customer ID: " + c.getId());
					System.out.print(" ||  Customer Name: " + c.getName());
					System.out.print(" ||  Customer City: " + c.getCity());
					System.out.println();
				}
				transaction.commit();
				break;
				
			case 6:
				List<Product> list1 = productService.fetchAllProducts();
				System.out.println("------ All Product Details ----\n");
				for(Product t: list1) {
					System.out.print("Product ID: " + t.getPid());
					System.out.print(" ||  Product Name: " + t.getPname());
					System.out.print(" ||  Product price: " + t.getPrice());
					System.out.println();
				}
				transaction.commit();
				break;
			case 7:
				System.out.println("Enter Customer ID: ");
		     int cid = sc.nextInt();
			System.out.println("Enter Product ID: ");
			 int pid = sc.nextInt();
			 productService.buyProduct(cid,pid);
				System.out.println("Customer buyed product");
				transaction.commit();
				break;
			case 8:
				System.out.println("Enter Vendor ID: ");
				int vidval = sc.nextInt();
				List<Product> listPro = vendorService.fetchproductByVendorId(vidval);
				System.out.println("------List of Products------");
				listPro.stream().forEach(p->{
					System.out.print(" Product Name: " + p.getPname());
					System.out.print(" || Product price: " +p.getPrice());
					System.out.println("");
				});
				transaction.commit();
				break;
			case 9:
				System.out.println("Enter Customer ID: ");
				int cidval = sc.nextInt();
		
				List<Product> listp =productService.fetchProductByCustomerId(cidval);
				System.out.println("------ All Product Details ----\n");
				listp.stream().forEach(p->{
					System.out.print("Product ID: " + p.getPid());
					System.out.print(" ||  Product Name: " + p.getPname());
					System.out.print(" ||  Product Price: " +p.getPrice());
					
					System.out.println();
				});
				transaction.commit();
				break;
				
			case 10:
				System.out.println("Enter Product ID: ");
				int pidval = sc.nextInt();
				
				List<Customer> listc =customerService.fetchPCustomerByProductId(pidval);
				System.out.println("------ All Customer Details ----\n");
				listc.stream().forEach(p->{
					System.out.print("Customer ID: " + p.getId());
					System.out.print(" ||  Customer Name: " + p.getName());
					System.out.print(" ||  Customer age: " +p.getAge());
					System.out.print(" ||  Customer city: " +p.getCity());
					
					System.out.println();
				});
				transaction.commit();
				break;
				
			case 11: System.out.println("Enter Customer ID: ");
			   cidval = sc.nextInt();
			
			List<Product> list4 =productService.fetchProductByCustomerId(cidval);
			System.out.println("------ All Product Details ----\n");
			list4.stream().forEach(p->{
				System.out.print("Product ID: " + p.getPid());
				System.out.print(" ||  Product Name: " + p.getPname());
				System.out.print(" ||  Product Price: " +p.getPrice());
				
				System.out.println();
			});
			System.out.println("Enter Product ID: ");
			 pidval = sc.nextInt();
			 product=productService.getProductById(pidval);
			 if(product == null)
					throw new RuntimeException("Invalid ID");
			 productService.deleteProduct(product);
				System.out.println("Processed refund");
			transaction.commit();
			break;
				
			default:
				transaction.commit();
				break;
			}
			
			}
	
		
		}
		catch(Exception e) {
			System.out.println(e);
 			transaction.rollback();
			
		}
		finally {
			entityManager.close();
			entityFactory.close();
		}
	}

}
