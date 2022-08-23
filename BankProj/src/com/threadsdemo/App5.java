package com.threadsdemo;

class C extends Thread{
	  int count=0;
	 
	void compute() {
		synchronized ("") {
			for(long i=0;i<100000000;i++) {
				count++;
			}
		}		
	}
	@Override
	public void run() {
		compute();
	}
}
public class App5 {
	public static void main(String[] args) throws InterruptedException {
		C c=new C();
		
		Thread t1 = new Thread(c, "T1");
		Thread t2 = new Thread(c, "T2");
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("count= " +c.count);
		
	}
}
