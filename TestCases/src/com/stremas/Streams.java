package com.stremas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
public static void main(String[] args) {
	ProductName e=new ProductName(1,"oppo",5000,"ABC");
	ProductName e2=new ProductName(2,"vivo",60000,"ABC");
	ProductName e3=new ProductName(3,"samsung",20000,"VTY");
	ProductName e4=new ProductName(4,"MNB",70000,"ZYV");
	ProductName e5=new ProductName(5,"MNV",1000,"SRT");
	
	List<ProductName>list=new ArrayList<>(Arrays.asList(e,e2,e3,e4,e5));
	
	List<Double> list1=list.stream().map(p->p.getPrice()).collect(Collectors.toList());
			System.out.println(list1);
			
			
			List<String> list2=list.stream().map(p->p.getName()).collect(Collectors.toList());
			System.out.println(list2);
			
			List<String> list3=list.stream().map(p->p.getModel()).collect(Collectors.toList());
			System.out.println(list3);
			
			List<Integer> list4=list.stream().map(p->p.getId()).collect(Collectors.toList());
			System.out.println(list4);
			
			
			
			
			long count=list.stream().count();
			System.out.println(count);
			System.out.println("count:"+count);
			
			List<ProductName> list5=list.stream().filter(p->p.getPrice()>=2000).collect(Collectors.toList());
			System.out.println(list5);
			System.out.println("filtre  :"+ list5);
			count =list.parallelStream().filter(p->p.getPrice()>=200).count();
			
			System.out.println("NO of product having price greater than 2000: " +count);
			
			
			List<ProductName> list6=list.stream().filter(p->p.getPrice()>=2000)
					.filter(p->p.getModel().toLowerCase().equals("abc"))
					.collect(Collectors.toList());
			
			
			System.out.println("list of filtred product"+list6);
			
			
}

	
}
