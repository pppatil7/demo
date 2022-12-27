package com.practice;

import java.util.Scanner;

public class MaxMinElement {

	public static void printMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("minimum element of array: " + min);
		System.out.println("maximum element of array: " + max);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int arraySize = scanner.nextInt();
		int[] arr = new int[arraySize];
		System.out.println("enter elements: ");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = scanner.nextInt();
		}

		printMinMax(arr);

	}

}
