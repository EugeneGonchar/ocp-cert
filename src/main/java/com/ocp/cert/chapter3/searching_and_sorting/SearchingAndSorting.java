package com.ocp.cert.chapter3.searching_and_sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingAndSorting {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 1, 6 };
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2));// 1
		System.out.println(Arrays.binarySearch(numbers, 3));// -3 (2 position -1)

		List<Integer> list = Arrays.asList(5, 2, 1, 6);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 2));// 1
		System.out.println(Collections.binarySearch(list, 3));// -3 (2 position -1)
	}

}
