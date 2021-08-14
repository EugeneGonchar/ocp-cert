package com.ocp.cert.ocp_cert.chapter2.functional_interface;

// this annotation checks that your interface contains exactly one abstract method
// every interface with one abstract method is functional interface by default
@FunctionalInterface
public interface FunctionalExampleInterface {

	void abstractMethod();

	// functional interface can contain static methods
	static void staticMethod() {

	}

}