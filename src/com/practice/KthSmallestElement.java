package com.practice;

import java.util.Arrays;

public class KthSmallestElement {

	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);

		return arr[k - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 45, 1, 23, 23, 556, 12 };
		int k = kthSmallest(arr, 2);
		System.out.println(k);
	}

}
