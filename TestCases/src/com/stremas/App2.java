package com.stremas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		Student s1=new Student(1,"harry",69,"mumbai");
		Student s2=new Student(2,"Erra",56,"pune");
		Student s3=new Student(3,"ron",52,"mumbai");
		Student s4=new Student(5,"snape",20,"pune");
		Student s5=new Student(6,"draco",31,"mumbai");
		Student s6=new Student(7,"nevi",89,"pune");
		Student s7=new Student(8,"potter",45,"mumbai");
		Student s8=new Student(9,"kelley",63,"pune");
		List<Student>list=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7));
		
		ConcurrentHashMap<String,List<Student>> map=new ConcurrentHashMap<>();
		ConcurrentHashMap<String,Long> resultmap=new ConcurrentHashMap<>();
		
		List<String> listcity=list.stream().map(s->s.getCity())
				.distinct()
				.collect(Collectors.toList());
		
		listcity.forEach(c->{
			map.compute(c, (k,v)-> list.stream().filter(s->s.getCity().equals(c)).collect(Collectors.toList()));
			
		});
		System.out.println(map);
		
		listcity.forEach(c->{
			resultmap.compute(c, (k,v)-> list.stream().filter(s->s.getCity().equals(c)).count());
			
		});
		System.out.println(resultmap);


	}

}
