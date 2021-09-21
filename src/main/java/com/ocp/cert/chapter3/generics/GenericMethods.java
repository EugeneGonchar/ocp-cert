package com.ocp.cert.chapter3.generics;

public class GenericMethods {

	public <T> T genericMethod(T object) {
		return object;
	}

	public static <T> T genericStaticMethod(T object) {
		return object;
	}

	public static void main(String[] args) {
		GenericMethods.genericStaticMethod("string");
		GenericMethods.<String>genericStaticMethod("string");// it's possible to write generic type obviously

		GenericMethods classWithGenericMethods = new GenericMethods();
		classWithGenericMethods.genericMethod("string");
		classWithGenericMethods.<String>genericMethod("string");// it's possible to write generic type obviously
	}

}
