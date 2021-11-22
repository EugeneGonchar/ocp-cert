package com.ocp.cert.chapter4.buildin_functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExamples {

	public static void main(String[] args) {
		UnaryOperator<String> unaryOperator = String::toUpperCase;
		unaryOperator.apply("asdf");

		BinaryOperator<String> binaryOperator = String::concat;
		binaryOperator.apply("asdf", "fdas");
	}

}
