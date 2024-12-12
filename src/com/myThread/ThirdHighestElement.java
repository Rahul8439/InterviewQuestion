package com.myThread;

import java.util.Arrays;
import java.util.stream.IntStream;

class ThirdHighestElement {
	static void thirdLargest(int arr[], int arr_size) {

		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}
		int first = arr[0];
		for (int i = 1; i < arr_size; i++)
			if (arr[i] > first)
				first = arr[i];

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];
		System.out.printf("The third Largest " + "element is %d\n", third);
	}
	
	public static void thirdHighestElement(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first<current){
                third = second;
                second = first;
                first = current;
            }else if(second<current){
                third = second;
                second = current;
            }else if(third<current){
                third=current;
            }
        }
        System.out.println("Third Highest element is: " + third);
    }

// Driver code
	public static void main(String[] args) {
		int arr[] = { 12, 14,13, 1,15,15, 10, 34, 16 };
		IntStream stream = Arrays.stream(arr);
		int n = arr.length;
		//thirdLargest(arr, n);
		thirdHighestElement(arr);
	}
}
