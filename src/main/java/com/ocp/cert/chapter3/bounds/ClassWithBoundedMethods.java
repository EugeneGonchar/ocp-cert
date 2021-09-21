package com.ocp.cert.chapter3.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassWithBoundedMethods {

	public static void unboundedMethod(List<?> list) {// unbounded wildcard

	}

	public static long upperBoundedMethod(List<? extends Number> list) {// upper-bounded method
		long count = 0;
		for (Number element : list) {
			count += element.longValue();
		}
		return count;
	}

	// compiler converts the method above into
	public static long upperBoundedMethodCompileVersion(List list) {
		long count = 0;
		for (Object obj : list) {
			Number number = (Number) obj;
			count += number.longValue();
		}
		return count;
	}

	public static void lowerBoundedMethod(List<? super Number> list) {// lower-bounded method

	}

	public static void main(String[] args) {
		List<? extends String> strings = new ArrayList<>();
		/*
		 * strings.add("string"); // compile error due to bounded and upper-bounded
		 * wildcards are immutable
		 */
		strings.add(null);
		strings.remove(0);// but it's still possible to delete elements

		List<? super Exception> exceptions = new ArrayList<Throwable>();
		// exceptions.add(new Throwable());// penguin?
		// exceptions.add(new Object());// penguin?
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());// penguin2?
	}

}
