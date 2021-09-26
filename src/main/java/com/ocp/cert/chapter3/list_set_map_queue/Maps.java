package com.ocp.cert.chapter3.list_set_map_queue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// O(1) adding and retrieving elements + no ordering
		HashMap<String, String> hashMap = new HashMap<>();

		// linked hash map
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

		// keys sorted tree structure
		TreeMap<String, String> treeMap = new TreeMap<>();

		// tread-safe deprecated
		Hashtable<String, String> hashTable = new Hashtable<>();
	}

}
