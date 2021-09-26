package com.ocp.cert.chapter3.new_in_java_8;

import java.util.HashMap;
import java.util.Map;

public class New {

	public static void main(String[] args) {
		Map<String, String> favourites = new HashMap<>();
		favourites.put("Tom", "Swimming");
		favourites.put("Sara", "Climbing");
		favourites.merge("Sara", "Jumping and running", (v1, v2) -> v1.length() > v2.length() ? v1 : v2);
		System.out.println(favourites);

		// function
		favourites.computeIfAbsent("Lars", v1 -> v1 + " smth");
		// bifunction
		favourites.computeIfPresent("Lars", (key, value) -> value + " bifunction");
		System.out.println(favourites);
	}

}
