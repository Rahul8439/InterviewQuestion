package com.myThread.binarySearch;

public class BinarySearchWithoutKnowingSortingOrder {

	public static void main(String[] args) {
		BinarySearchWithoutKnowingSortingOrder obj = new BinarySearchWithoutKnowingSortingOrder();

		int[] a = { 22, 20, 15, 12, 10, 07, 5, 2, 1 };
		String findSortingOrder = obj.findSortingOrder(a);
		System.out.println("Sorting Order:"+findSortingOrder);
	}

	private String findSortingOrder(int[] a) {
		if (a[0] < a[1]) {
			return "ASC";
		} else {
			return "DESC";
		}

	}
}
