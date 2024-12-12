package com.myThread.binarySearch;

public class FindFloorElementFromSortedArray {
	public static void main(String[] args) {
		int[] a = { 1,2,3,4,6,7,8,10,13,14,15 };
		int element=60;
		int findFloorElementFromSortedArray = findFloorElementFromSortedArray(a,0,a.length-1,element);
		System.out.println("findFloorElementFromSortedArray "+findFloorElementFromSortedArray);
	}

	private static int findFloorElementFromSortedArray(int[] a, int start, int end, int element) {
		int res=-1;
		while (start <= end) {
			int mid=start+(end-start)/2;
			if(a[mid]==element) {
				return a[mid];
			}
			if(a[mid]<element) {
				start=mid+1;
				res=a[mid];
			}else {
				end=mid-1;
			}
		}
		return res;
	}
}
