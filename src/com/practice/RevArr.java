package com.practice;

import java.util.Arrays;

public class RevArr {

	public static void revArray(int[] arr) {
		int temp = 0;
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 67, 325, 2541, 1, 2, 635 };
		revArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
