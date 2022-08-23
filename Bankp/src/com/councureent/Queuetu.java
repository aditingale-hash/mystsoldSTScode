package com.councureent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Queuetu {
public static void main(String[] args) {
	Deque<Integer> queue = new ArrayDeque<>();
	
	queue.offer(3);
	queue.offer(2);
	queue.offer(4);
	
	queue.addFirst(10);
	System.out.println(queue);
	
	Deque<Integer> queue1 = new LinkedList<>();	
	queue1.offer(3);
	queue1.offer(1);
	queue1.offer(4);
	queue1.offer(null);
	queue1.addFirst(10);
	System.out.println(queue1);
	
	Deque<Integer> queue2 = new LinkedList<>();	
	queue2.offer(3);
	queue2.offer(1);
	queue2.offer(4);
	queue2.offer(null);
	queue2.addFirst(10);
	
	Iterator<Integer> s =queue2.descendingIterator();
	
	while(s.hasNext()) {
		System.out.println(s.next()+"-----");	
		}
	}
}
