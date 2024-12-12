package com.myThread.binarySearch;

public class BinarySearchWithDescSorting {
	
	
	public static void main(String[] args) {
		BinarySearchWithDescSorting obj=new BinarySearchWithDescSorting();
		int[] a= {22,20,15,12,10,07,5,2,1};
		int index=obj.binarySearchWithDescSorting(a,1);
		if(index<0) {
			System.out.println("Data Not Found");
		}else {
			System.out.println("Index "+index);
		}
	}

	private int binarySearchWithDescSorting(int[] a,int element) {
		int start=0,end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==element) {
				return mid;
			}else if(element<a[mid]){
				start=(mid+1);
			}else {
				end=(mid-1);
			}
		}return -1;
		
	}
}
