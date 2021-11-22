package com.ocp.cert.chapter3.list_set_map_queue;

import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// implements NavigableSet
		TreeSet<String> strings = new TreeSet<>();
		strings.lower(null); // <
		strings.floor(null); // <=
		strings.higher(null); // >
		strings.ceiling(null); // >=
	}

}
