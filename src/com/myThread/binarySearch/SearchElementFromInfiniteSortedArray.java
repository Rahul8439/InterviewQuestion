package com.myThread.binarySearch;

public class SearchElementFromInfiniteSortedArray {
	public static void main(String[] args) {
		int[] a = { 1,2,3,4,6,7,8,10,13,14,15 };
		int index=searchElementFromInfiniteSortedArray(a,0,1,13);
		System.out.println("SearchElementFromInfiniteSortedArray "+index);
	}

	private static int searchElementFromInfiniteSortedArray(int[] a, int start, int end, int element) {

		while (a[start] < element && a[end] < element) {
			start=end;
			end=end*2;
		}
		BinarySearchWithAscSorting obj=new BinarySearchWithAscSorting();
		int index=obj.binarySearchWithAscSorting(a,element,start,end);
		if(index>0) {
			return index;
		}
		return -1;

	}
}
