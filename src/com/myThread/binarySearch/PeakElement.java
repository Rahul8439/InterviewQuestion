package com.myThread.binarySearch;


public class PeakElement {

	public static void main(String[] args) {
		int[] a = { 30, 10, 9, 15 };
		//int[] a = { 30, 10, 9, 15,20,14 };
		int element = findPeakElementfromUnsortedArray(a);
		System.out.println("Peak Element:"+element);
	}

	//InBitonic Array Only single peak element is exist but in this program multiple peak element we can get
	
	private static int findPeakElementfromUnsortedArray(int[] a) {
		int start = 0, end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid > 0 && mid < a.length - 1) {
				if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
					return a[mid];
				}
				if (a[mid] < a[mid + 1]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (mid == 0 && a[mid] > a[mid + 1]) {
					return a[mid];
				}
				if (mid == a.length - 1 && a[mid] > a[mid - 1]) {
					return a[mid];
				}
			}

		}
		return -1;
	}

}
