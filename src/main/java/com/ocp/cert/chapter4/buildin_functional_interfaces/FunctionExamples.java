package com.ocp.cert.chapter4.buildin_functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExamples {

	public static void main(String[] args) {
		Function<String, Integer> function = String::length;
		function.apply("sadf");

		BiFunction<String, Integer, Character> biFunction = String::charAt;
		biFunction.apply("asdf", 12);
	}

}
