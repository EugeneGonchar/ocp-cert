package com.ocp.cert.chapter4.buildin_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExamples {

	public static void main(String[] args) {
		Consumer<String> sysoutConsumer = System.out::println;
		sysoutConsumer.accept("asdf");
		sysoutConsumer.andThen(a -> System.out.println("fdas")).accept("123");

		Map<String, Integer> hashMap = new HashMap<>();
		BiConsumer<String, Integer> putBiConsumer = hashMap::put;
		putBiConsumer.accept("key", 12);
		putBiConsumer.andThen((a, b) -> System.out.println(a + " " + b)).accept("next", 11);
		System.out.println(hashMap);
	}

}
