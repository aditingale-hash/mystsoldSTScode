package com.councureent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcureentHashmap {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
		
	map.put(1,"Harry");
	map.put(3,"ABC");
	map.put(5,"Angel");
		
	
	map.putIfAbsent(2, "Potter");
	map.putIfAbsent(4, "scarlet");
	System.out.println(map);
	
	map.put(1, "snape");
	System.out.println(map);
	
	System.out.println("****************************************************");
	
	map.replace(3, "ABC", "kyara");
	System.out.println(map);
	System.out.println("****************************************************");
	
	map.remove(3);
	System.out.println(map);
	System.out.println("****************************************************");
	
	//map.clear();
	//System.out.println(map);
	
	System.out.println("****************************************************");

	for(Map.Entry<Integer, String> m :map.entrySet()) {
		
		System.out.println(m.getKey()+"-----"+m.getValue());
	}
	
	System.out.println("------------------------------------");
	
	map.forEach((k,v)->
	{
		System.out.println(k+"----"+v);
	}
	);
	System.out.println("****************************************************");
	
	map.forEach( (k,v)->System.out.println(k+" "+v) );
	
	System.out.println("****************************************************");	
	//map.compute(5, (k,v)->k>4?"snape":null); don't accept null value
	map.compute(7, (k,v)->k>map.size()?"potter":v);
	System.out.println(map);
	//map.compute(5, (k,v)->k>map.size()?"ABC":null); null exception don't accept null value
	System.out.println("****************************************************");
	}

}

