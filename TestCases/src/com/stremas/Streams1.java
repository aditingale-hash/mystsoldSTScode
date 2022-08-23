package com.stremas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {
public static void main(String[] args) {
	ProductName e=new ProductName(1,"oppo",5000,"ABC");
	ProductName e2=new ProductName(2,"vivo",60000,"ABC");
	ProductName e3=new ProductName(3,"samsung",20000,"VTY");
	ProductName e4=new ProductName(4,"MNB",70000,"ZYV");
	ProductName e5=new ProductName(5,"MNV",1000,"SRT");
	
	List<ProductName>list=new ArrayList<>(Arrays.asList(e,e2,e3,e4,e5));
	
	//calculate sum of all price 
	double sumPrices=list.stream()
			.map(p->p.getPrice())
			.reduce(0.0,Double::sum);
	System.out.println("sum"+ sumPrices);
	
	
//alternative way
	
	
	
	double sum2=list.stream()
			.collect(Collectors.summingDouble(p->p.getPrice()));
	
	System.out.println("sum aleternativ way"+ sum2);
	
	double max=list.stream()
			.map(p->p.getPrice())
			.reduce(0.0,Double::max);
	System.out.println(" max  price"+ max);
	
	double min1=list.stream()
			.map(p->p.getPrice())
			.reduce(70000.0,Double::min);
	System.out.println(" min  price"+ min1);
	
	
	
	

}
}
