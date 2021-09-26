package com.ocp.cert.chapter3.list_set_map_queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Lists {

	public static void main(String[] args) {
		// better to use this for reading
		ArrayList<String> strings = new ArrayList<>();

		/*
		 * better to use this for adding and deleting (it's like list and deque)
		 */
		LinkedList<String> strings2 = new LinkedList<>();

		// it's like arraylist but deprecated and tread-safe
		Vector<String> strings3 = new Vector<>();

		/*
		 * null values cannot be added + better for adding + less memory consumption +
		 * don't implement list interface + LIFO
		 */
		ArrayDeque<String> strings4 = new ArrayDeque<>();

		// old implementation + extends Vector + LIFO
		Stack<String> strings5 = new Stack<>();
	}

}
