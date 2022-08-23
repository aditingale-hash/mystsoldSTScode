package listexp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
	Emp e1=new Emp(1,"harry",75000,"magic");
	Emp e2=new Emp(2,"emma",5000,"Love");
	Emp e3=new Emp(3,"ronald",4000,"speed");
	Emp e4=new Emp(4,"flash",45000,"slow");
	
	List <Emp> list = new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
System.out.println("================================collection sorting ===============================");


Scanner sc =new Scanner(System.in);
while(true)
{	
for(Emp e:list) {
	
	System.out.println(e);
}
System.out.println("1.asecending");
System.out.println("2.desecending");
System.out.println("0.exit");
int input=sc.nextInt();
if(input==0)
{
break;	

}
switch(input) {
case 1:Collections.sort(list,new N());
for(Emp e:list) {
	
	System.out.println(e);
}
case 2:Collections.sort(list,new P());
for(Emp e:list) {
	
	System.out.println(e);
}
}
}
}
}
class N implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			return 0;
		}
		return -1;
	}
}
class P implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		if(e1.getSalary()<e2.getSalary())
		{
			return 1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			return 0;
		}
		return -1;
	}


	}
	
