package com.ocp.cert.chapter3.generics;

public class GenericClass<T> { // after compilation Java replaces T by Object

	// E for elements
	// K for keys
	// V for values
	// N for numbers
	// T for a generic data type
	// S, U, V and so forth for multiple generic types

	private T object;

	public GenericClass(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public static void main(String[] args) {
		GenericClass<String> genericClass = new GenericClass<>("smth");
		String smth = genericClass.getObject(); // after compilation java adds (String) before genericClass.getObject();
	}

}
