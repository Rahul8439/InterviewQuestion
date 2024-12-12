package com.myThread.binarySearch;

public class findElementInSortedRotatedArray {
	public static void main(String[] args) {
		int[] a = { 11, 12, 15, 18,2,4,5,8 };
		int indexOfMinElement = NumberOfTimesArrayRotate.findNumberOfTimesArrayRotate(a,0,a.length - 1,a.length);
		int elemnentSearch=12;
		
		BinarySearchWithAscSorting obj=new BinarySearchWithAscSorting();
		int binarySearchWithAscSorting = obj.binarySearchWithAscSorting(a, elemnentSearch, 0, indexOfMinElement-1);
		System.out.println(binarySearchWithAscSorting);
	}
}
