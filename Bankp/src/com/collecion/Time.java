package com.collecion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Time {
public static void main(String[] args) {
	System.out.println("===================cureent date ===================");
	LocalDate id=LocalDate.now();
	LocalTime it=LocalTime.now();
	LocalDateTime hk=LocalDateTime.now();
	System.out.println(id);
	System.out.println(it);
	System.out.println(hk);
	 System.out.println("==================Custom date===================");
	 LocalDate a=LocalDate.of(2020,Month.JANUARY,1);
	 LocalTime b=LocalTime.of(10,20,30,100);
	 LocalDateTime c=LocalDateTime.of(2021,Month.JANUARY,10,10,30);
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println("==================================manupaltaing date========================");
	 LocalDate k=LocalDate.now().plusDays(2);
	 System.out.println(k);
	 LocalTime j=LocalTime.now().minusMinutes(30);
	 System.out.println(j);
	 
	
	 System.out.println("==================================customize cureent date========================");
	 LocalDate e=LocalDate.now().withDayOfMonth(19).withYear(2022);
	 System.out.println(e);
	
	 
	
	 
}
}
