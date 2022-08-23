package com.collecion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
public static void main(String[] args) {
	ExecutorService executoreservice =Executors.newFixedThreadPool(4);
	
	executoreservice.submit(new Player1());
	executoreservice.submit(new Player2());
	executoreservice.submit(new Player3());
	executoreservice.shutdown();
}
}
 class Player1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.cureentThread().getName());
		System.out.println("player 1 started......");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("player 1ends.......");
	}

	 
	 
	 
	 
 }