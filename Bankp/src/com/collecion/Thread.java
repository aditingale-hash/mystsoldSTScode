package com.collecion;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread {
	public static void main(String[] args) {
		ExecutorService executoreservice =Executors.newSingleThreadExecutor();
		Myclas myc=new Myclas();
		executoreservice.submit(myc);
		executoreservice.shutdown();		
	}

	public static Object cureentThread() {
		// TODO Auto-generated method stub
		return null;
	}
}
class Myclas implements Runnable {	
	@Override
	public void run() {
		task();		
	}
	public void task() {
		System.out.println("My task");	
	}
}

