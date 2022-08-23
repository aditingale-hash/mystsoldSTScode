package com.threadsdemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws Exception, ExecutionException {
		//2 nos: divide and return the result 
		
		//executorService - One - start thread - run() - task()
		
		ExecutorService  executorService 
		= Executors.newSingleThreadExecutor();
		
		One one = new One();
		Future<Integer> res = executorService.submit(one);
		System.out.println(res.get());
		executorService.shutdown();
	}
}
 
class One implements Callable<Integer> {

	public int task(int n1,int n2) throws Exception{
		return n1/n2;
	}

	@Override
	public Integer call() throws Exception {
		return task(20,10);
	}

	 
	 
	
}