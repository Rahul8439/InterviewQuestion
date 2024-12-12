package com.myThread.binarySearch;

public class NumberOfTimesArrayRotate {
	public static void main(String[] args) {
		// Index of smallest element in rotated array = Number of times array rotate
		int[] a = {8,9, 11, 12, 15,17, 1,1, 2, 4, 5, 7 };
		int rotateCount = findNumberOfTimesArrayRotate(a,0,a.length - 1,a.length);
		System.out.println("Number of times array rotate "+rotateCount);
	}


	public static int findNumberOfTimesArrayRotate(int[] a,int start,int end,int n) {
		while (start <= end) {
			
			 if (a[start] <= a[end]) {
	                return start;
	            }
			
			int mid = (start + end) / 2;

			int prev = (mid + n - 1) % n;

			int next = (mid + 1) % n;

			if (a[mid] <= a[prev] && a[mid] <= a[next]) {
				return mid;
			}
			if (a[start] <= a[mid]) {// Discard sorted array
				start = mid + 1;
			} else if (a[mid] <= a[end]) {
				end = mid - 1;
			}

		}
		return -1;

	}
	


}
