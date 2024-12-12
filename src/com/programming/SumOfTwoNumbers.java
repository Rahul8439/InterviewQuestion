package com.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		Map<String,String> map =new HashMap<>();
		map.put("test", "Rahul");
		String string = map.get("rahul");
		System.out.println(string);//null
		int[] a = { 3, 4, 2, 6, 4, 8, 7 };
		int element = 10;
		int[] findSum = findSum(a, element);
		List<int[]> list=listOfCombinationOfSum(a,element);
		System.out.println(list);
		System.out.println(findSum);
	}

	private static int[] findSum(int[] nums, int element) {
		Map<Integer, Integer> numToIndexMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = element - nums[i];

			// If the complement is in the map, we've found the pair.
			if (numToIndexMap.containsKey(complement)) {
				int complementIndex = numToIndexMap.get(complement);
				return new int[] { complementIndex, i };
			}

			// Otherwise, add the current number to the map with its index.
			numToIndexMap.put(nums[i], i);
		}
		return null;

	}
	
	private static List<int[]> listOfCombinationOfSum(int[] nums, int element) {
		Map<Integer, Integer> numToIndexMap = new HashMap<>();
		List<int[]> list=new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = element - nums[i];

			// If the complement is in the map, we've found the pair.
			if (numToIndexMap.containsKey(complement)) {
				int complementIndex = numToIndexMap.get(complement);
				list.add(new int[] { complementIndex, i });
			}

			// Otherwise, add the current number to the map with its index.
			numToIndexMap.put(nums[i], i);
		}
		return list;

	}
}
