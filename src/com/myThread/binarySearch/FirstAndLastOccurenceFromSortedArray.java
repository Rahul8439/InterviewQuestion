package com.myThread.binarySearch;

public class FirstAndLastOccurenceFromSortedArray {
	public static void main(String[] args) {
		int[] a = { 1,2,2,2,3,4,6,7,8,10 };
		int findFirstOccurence = new FirstAndLastOccurenceFromSortedArray().findFirstOccurence(a,2);
		System.out.println("First Occurence "+findFirstOccurence);
		
		int findLastOccurence = new FirstAndLastOccurenceFromSortedArray().findLastOccurence(a,2);
		System.out.println("First Occurence "+findLastOccurence);
		
		int totalOccurence=findLastOccurence-findFirstOccurence +1;
		System.out.println("Total Elemnt Occurence "+totalOccurence);
	}
	
	int findFirstOccurence(int[] a,int element) {
		int res=-1;
		int start=0,end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==element) {
				res=mid;
				end=(mid-1);
			}else if(element>a[mid]){
				start=(mid+1);
			}else {
				end=(mid-1);
			}
		}return res;
		
	}
	
	int findLastOccurence(int[] a,int element) {
		int res=-1;
		int start=0,end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==element) {
				res=mid;
				start=(mid+1);
			}else if(element>a[mid]){
				start=(mid+1);
			}else {
				end=(mid-1);
			}
		}return res;
		
	}
}
