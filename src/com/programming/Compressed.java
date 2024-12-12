package com.programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Compressed {
	public static void main(String[] args) {
		Compressed c=new Compressed();
		List<Character> asList = Arrays.asList('a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c');
		c.compressedConsecutiveRepeatingChar(asList);
		
	}

	private void compressedConsecutiveRepeatingChar(List<Character> asList) {
		StringBuffer sb = new StringBuffer();
		asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.forEach(entry -> sb.append(entry.getKey()).append(entry.getValue()));
		/*
		 * Map<Character, Integer> map = new HashMap<>(); asList.stream().forEach(a -> {
		 * map.put(a, map.getOrDefault(a, 0) + 1); }); StringBuffer sb = new
		 * StringBuffer(); map.keySet().forEach(key -> {
		 * 
		 * if (map.get(key) > 1) { sb.append(key).append(map.get(key)); }
		 * 
		 * });
		 */
		System.out.println(sb.toString());

	}
}
