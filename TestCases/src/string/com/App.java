package string.com;
import java.util.ArrayList;
import java.util.List;
class App{
public static void main(String[] args)
{
   String QrCode="Oppo+23400+4*Samsung+21900+2";
   List<Product> productlist=new ArrayList<>();
   String[] s1=QrCode.split("\\*");
   for (String s:s1)
   {
	  String[] s2=s.split("\\+");   
	  Product p=new Product();
	  p.setName(s2[0]);
      p.setPrice(Double.parseDouble(s2[1]));
      p.setQuantity(Integer.parseInt(s2[2]));
      productlist.add(p);  
     
     }
    Order o=new Order(productlist);
    o.printReceipt();
}

}
class Product
{
String name;
double price;
int quantity;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}

public void setPrice(double d) {
	this.price = d;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int   d) {
	this.quantity = d;
}
	
}
class Order
{
List<Product> products;

public Order(List<Product> product)
{
 this.products=product;	
	
}
public void printReceipt()
{
	System.out.println("*****  INVOICE *****");
	for(Product p:products)
	{
	  System.out.println("NAME:\t"+p.name);  	
	  System.out.println("PRICE:\t"+p.price);
	  System.out.println("QUANTITY:  "+p.quantity);
	  System.out.println("_____________");
	  
	}
	
}


}  


