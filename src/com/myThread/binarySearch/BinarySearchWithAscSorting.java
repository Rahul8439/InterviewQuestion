package com.myThread.binarySearch;

public class BinarySearchWithAscSorting {
	
	public static void main(String[] args) {
		BinarySearchWithAscSorting obj=new BinarySearchWithAscSorting();
		int[] a= {1,4,7,9,12,15,17,20,22};
		int index=obj.binarySearchWithAscSorting(a,6,0,a.length-1);
		if(index<0) {
			System.out.println("Data Not Found");
		}else {
			System.out.println("Index "+index);
		}
	}

	public int binarySearchWithAscSorting(int[] a,int element,int start,int end) {
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==element) {
				return mid;
			}else if(element>a[mid]){
				start=(mid+1);
			}else {
				end=(mid-1);
			}
		}return -1;
		
	}
}
