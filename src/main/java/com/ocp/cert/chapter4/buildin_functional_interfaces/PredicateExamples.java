package com.ocp.cert.chapter4.buildin_functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		Predicate<String> stringPredicate = String::isBlank;
		boolean result = stringPredicate.negate().test("sadf");
		System.out.println(result);// true

		BiPredicate<String, String> smth = String::contains;
		boolean biResult = smth.test("asdf", "as");
		System.out.println(biResult);// true
	}

}
