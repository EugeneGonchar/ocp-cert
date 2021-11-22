package com.ocp.cert.chapter4.buildin_functional_interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {
		Supplier<LocalDate> localDateSupplier = LocalDate::now;
		System.out.println(localDateSupplier.get());
	}

}
