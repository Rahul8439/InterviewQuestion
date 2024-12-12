package com.myThread;

public class ThirdMinElementFromArray {
	static void thirdSmarllest(int arr[], int arr_size) {

		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}
		int first = arr[0];
		for (int i = 1; i < arr_size; i++)
			if (arr[i] < first)
				first = arr[i];

		int second = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] < second && arr[i] > first)
				second = arr[i];
		int third = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] < third && arr[i] > second)
				third = arr[i];
		System.out.printf("The third Largest " + "element is %d\n", third);
	}
	
	public static void thirdSmallestElement(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first>current){
                third = second;
                second = first;
                first = current;
            }else if(second>current){
                third = second;
                second = current;
            }else if(third>current){
                third=current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }

// Driver code
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 16 };
		int n = arr.length;
		thirdSmarllest(arr, n);
		thirdSmallestElement(arr);
	}
}
