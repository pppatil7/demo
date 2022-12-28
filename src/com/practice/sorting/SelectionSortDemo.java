package com.practice.sorting;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {

		// selection sort
		//time complexity O(n^2)

		int[] arr = { 7, 8, 3, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {

			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
