package com.jnuitdemo.main;

import java.util.Scanner;

public class Email{
	
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String email= sc.next();
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      boolean result = email.matches(regex);
	      if(result) {
	         System.out.println(" valid");
	      } else {
	         System.out.println("not valid");
	      }
	   }
	}


