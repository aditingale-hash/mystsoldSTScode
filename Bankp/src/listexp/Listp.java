package listexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listp {
	public static void main(String[] args) {
		List<Integer> lst =new ArrayList<>();
		lst.add(1);
		lst.add(4);
		lst.add(2);
		System.out.println(lst);
		
		System.out.println("=============iteration using for loop================");
		for(int i: lst) {
			
			System.out.println(i+" ");
		}
		/*
		System.out.println("=============iteration using iterator interface=========================");
		
		Iterator<Integer> itr=lst.iterator();
		while(itr.hasNext()) {
			
			
			System.out.println(itr.hasNext()+" ");
		}
		*/
		Collections.sort(lst);
		
for(int i:lst) 
{
	System.out.println(i+" ");
}
		
System.out.println("\n");
 
int ele=lst.get(2);
System.out.println(ele);


int e=lst.remove(2);		
System.out.println("\n"+e);

List l1=lst.subList(0, 2);
System.out.println("\n"+l1);

System.out.println();

int e1=4;
boolean status=lst.contains(e1);
System.out.println(status?"present":"not present");
 
	}
	

}
