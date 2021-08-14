package com.ocp.cert.chapter2.functional_interface;

public class ExampleForFunctionalInterface {

	public static void main(String[] args) {
		FunctionalExampleInterface func = () -> System.out.println("Hello world directly");
		func.abstractMethod();
		doSmth(() -> System.out.println("Hello world using method"));
	}

	public static void doSmth(FunctionalExampleInterface functionalInterface) {
		functionalInterface.abstractMethod();
	}

}
