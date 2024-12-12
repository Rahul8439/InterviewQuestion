package com.learning.practice;

public class Search {

	public static void main(String[] args) {
		int[] a= {5,6,7,10,2,3,4};
		
		int n=a.length,start=0,end=n-1;
		
		while(start<=end) {
			
			if(a[start]<=a[end]) {
				System.out.println(start);
				break;
			}
			
			int mid=(start+end)/2;
			int prev=(mid+n-1)%n;
			System.out.println(a[prev]);
			int nex=(mid+1)%n;
			System.out.println(a[nex]);
			
			if(a[mid]<=a[prev] && a[mid]<=a[nex]) {
				System.out.println(mid);
				break;
			}if(a[start]<= a[mid]) {
				start=mid+1;
			}else if(a[mid]<=a[end]) {
				end=mid-1;
			}
			
		}
		
		
	}

}
