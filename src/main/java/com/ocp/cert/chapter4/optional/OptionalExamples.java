package com.ocp.cert.chapter4.optional;

import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {
		Optional<Double> optional = Optional.of(12.23);
		System.out.println(optional.get());
		System.out.println(optional.orElse(22.22));
		System.out.println(optional.orElseGet(() -> 12.22));
		System.out.println(optional.orElseThrow(IllegalArgumentException::new));

		optional = Optional.ofNullable(null);
		System.out.println(optional.orElse(22.22));
		System.out.println(optional.orElseGet(() -> 12.22));
		System.out.println(optional.orElseThrow(IllegalArgumentException::new));
	}

}
