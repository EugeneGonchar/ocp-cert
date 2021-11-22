package com.ocp.cert.chapter4.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Common {

	/**
	 * Only terminal operators start the execution of pipeline
	 *
	 * Stream cannot be used again after using terminal operation
	 *
	 *
	 */

	public static void main(String[] args) {
	}

	public static void streamCreation() {
		Stream.empty();
		Stream.of(new Object(), new Object());

		Stream.iterate(1, n -> n + 2);
		Stream.generate(Math::random);
	}

	public static void terminalStreamOperations() {
		// count()
		Stream<String> strings = Stream.of("a", "b", "c");
		strings.count();

		// min() and max()
		strings.max(String::compareTo).ifPresent(System.out::println);
		strings.min(String::compareTo).ifPresent(System.out::println);

		// findAny() and findFirst()
		// these method can stop infinite stream
		strings.findAny().ifPresent(System.out::println);
		strings.findFirst().ifPresent(System.out::println);

		// allMatch(), anyMatch(), noneMatch()
		strings.allMatch(e -> e.length() >= 1);
		strings.anyMatch(e -> e.length() >= 1);
		strings.noneMatch(e -> e.length() >= 1);

		// forEach(). can be used directly without stream(). terminal operator
		strings.forEach(System.out::println);

		// reduce()
		Stream<String> reduce1 = Stream.of("I ", " like ", " something");
		reduce1.reduce("", String::concat);

		reduce1.reduce(String::concat).ifPresent(System.out::println);

		Stream<Integer> reduce2 = Stream.of(2, 4, 4536, 12);
		// third parameter is using for parallel stream to combine results from streams
		reduce2.reduce(1, (a, b) -> a * b, (a, b) -> a * b);

		// collect()
		reduce1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
	}

	public static void lazyExample() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		Stream<String> exampleStream = list.stream();
		list.add("3");
		exampleStream.count();// 3 because stream is lazy initialized
	}

	public static void partitioningAndGrouping() {
		Stream<String> stream = Stream.of("1", "223", "33");
		stream.collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.toList()));
		stream.collect(Collectors.partitioningBy(s -> s.length() > 2));// partitioning is grouping into 2 categories

	}

}
