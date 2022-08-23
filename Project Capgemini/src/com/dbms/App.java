package com.dbms;
import java.util.List;
import java.util.Scanner;

import com.p.Project;
public class App {

	private static Scanner sc;

	public static void main(String[] args) {
			DB db = new DB();
		   System.out.println("welcome to the project!!!!!!!!!!!!");
		   System.out.println("                                                  ");
	       System.out.println("***************************************************************");
	       List<Project> list=db.fectchAllPolicy();
	       System.out.println("ID"+ "\t  " +"NAME"+"  \t"+"AGE"+"\t"+"AMOUNT"+"\t\t"+"POLICY");
	    	System.out.println("---------------------------------------------------------------"); 
	       for(Project stud:list) {
	    	
	       	System.out.println(stud.getId()+ "\t" +stud.getName()+"\t"+stud.getTerm()+"\t"+stud.getPremium()+"\t\t"+stud.getAvalibleFor());
	       	
	       }
	       System.out.println("**************************************************************"); 
	       System.out.println("                                                  ");
	       System.out.println("Group Policy By Avalible For:"); 
	       System.out.println("                                                  ");
	      System.out.println( db.GroupPolicyByAvalibleFor(list));
	      db.sort(list); 
	    	System.out.println("---------------------------------------------------------------"); 
	    	System.out.println("                                                  ");

	    	   System.out.println("Sort all Policies by terms(Higher to Lower)"); 
		      
	    	System.out.println("                                                  ");
	       for(Project stud:list) {
	    	
	       	System.out.println(stud.getName()+"\t"+stud.getTerm());
	       	
	       }
	       sc = new Scanner(System.in);
	     System.out.println("enter premium:");
	     double e=sc.nextDouble();
	         try {
	        	 List<Project> list3=db.abc(e, list);
	        	 for(Project stud:list3) {
	     	    	
	     	       	System.out.println(stud.getId()+ "\t" +stud.getName()+"\t"+stud.getTerm()+"\t"+stud.getPremium()+"\t\t"+stud.getAvalibleFor());
	     	       	
	     	       }
			} catch (InvalidPremiumAmountException e1) {
			System.out.println(e1.getMsg());
			}
	    
		       	}

}
