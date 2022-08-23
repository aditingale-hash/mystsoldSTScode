package com.threadsdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		/*
		 * Initializing ExecutorService as single Thread Executor
		 */
		ExecutorService  executorService 
						= Executors.newSingleThreadExecutor();
		
		MyClass myc = new MyClass(); 
		
		/*
		 * submit out class to executor
		 */
		executorService.submit(myc);
		
		/*
		 * shutdown the executor to stop memory leakage
		 */
		executorService.shutdown();
	}
}

class MyClass implements Runnable{

	public void task() {
		System.out.println("My task");
	}
	@Override
	public void run() {
		 task();
	}
}