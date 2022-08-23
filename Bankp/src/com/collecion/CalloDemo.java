package com.collecion;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalloDemo {
	public static void main(String[] args) throws Exception , ExecutionException {
		ExecutorService executoreservice =Executors.newSingleThreadExecutor();
		
		One one=new One();
		Future<Integer> res=executoreservice.submit(one);
		System.out.println(res.get());
		executoreservice.shutdown();
		
	}

}
class One implements Callable<Integer>{
	public int task(int n1,int n2) throws Exception{
		return n1/n2;
		
	}

	@Override
	public Integer call() throws Exception {
		return task(20,10);

	}
	
	
}