package com.ocp.cert.chapter3.comparator_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample implements Comparator<String> {

	private String name;

	private int age;

	public ComparatorExample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Comparator<ComparatorExample> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<ComparatorExample> comparator2 = Comparator.comparing(ComparatorExample::getName)
				.thenComparingInt(ComparatorExample::getAge);

		List<ComparatorExample> list = Arrays.asList(new ComparatorExample("b", 12), new ComparatorExample("a", 13));
		list.sort(comparator);
		Collections.sort(list, comparator);

		// doesn't compile due to comparatorExample doesn't implement Comparable
		// interface with compareTo()
		// Collections.sort(list);
		System.out.println(list);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ComparatorExample [name=" + name + "]";
	}

	@Override
	public int compare(String o1, String o2) {
		return 0;
	}

}
