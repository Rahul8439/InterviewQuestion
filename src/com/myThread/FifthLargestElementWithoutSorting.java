package com.myThread;

import java.util.Random;

public class FifthLargestElementWithoutSorting {
    public static void main(String[] args) {
        // Sample array
        int[] array = {12, 45, 1, 78, 90, 56, 89, 23, 76};

        int fifthLargest = findFifthLargestElement(array);

        // Print the fifth largest element
        System.out.println("Fifth Largest Element: " + fifthLargest);
    }

    public static int findFifthLargestElement(int[] array) {
        return quickselect(array, 0, array.length - 1, 5);
    }

    public static int quickselect(int[] array, int left, int right, int k) {
        if (left == right) {
            return array[left];
        }

        int pivotIndex = randomPartition(array, left, right);
        int rank = pivotIndex - left + 1;

        if (k == rank) {
            return array[pivotIndex];
        } else if (k < rank) {
            return quickselect(array, left, pivotIndex - 1, k);
        } else {
            return quickselect(array, pivotIndex + 1, right, k - rank);
        }
    }

    public static int randomPartition(int[] array, int left, int right) {
        int randomIndex = new Random().nextInt(right - left + 1) + left;
        swap(array, randomIndex, right);
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] >= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
