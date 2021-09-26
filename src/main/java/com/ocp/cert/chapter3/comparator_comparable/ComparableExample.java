package com.ocp.cert.chapter3.comparator_comparable;

public class ComparableExample implements Comparable<ComparableExample> {

	private String name;

	@Override
	public int compareTo(ComparableExample o) {
		// 0 when equals
		// -1 when current object is smaller than given
		// 1 when current object is bigger than given
		return name.compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

}
