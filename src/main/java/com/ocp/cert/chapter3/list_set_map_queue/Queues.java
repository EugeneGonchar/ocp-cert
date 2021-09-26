package com.ocp.cert.chapter3.list_set_map_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {

		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(1);
		queue.offer(10);
		queue.offer(12);
		System.out.println(queue.peek()); // get from head // 1
		System.out.println(queue.poll()); // get + remove from head // 1
		System.out.println(queue.poll()); // get + remove from head // 10

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(1);
		stack.push(10);
		stack.push(12);
		System.out.println(stack.peek()); // get from head // 12
		System.out.println(stack.poll()); // get + remove from head // 12
		System.out.println(stack.peek()); // get from head // 10
	}

}
