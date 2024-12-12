package com.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		Reverse rv=new Reverse();
		String a="Rpaholi";
		String reverse=rv.reverseVowels(a);
		System.out.println(reverse);
		
		String sentence="the sky is blue";
		String reverseSentence=reserveWord(sentence.trim());
		System.out.println(reverseSentence);
		System.out.println(reverseSentence.length());
	}

	private static String reserveWord(String sentence) {
		String[] split = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		int i = split.length - 1;
		while (i >= 0) {
			if (!split[i].isEmpty()) {
				sb.append(split[i]);
				i--;
				sb.append(" ");
			}
		}

		return sb.toString().trim();
	}

	private String reverseVowels(String a) {
		a="Rpaholiqwt";
		List<Character> vowelList = Arrays.asList('a','e','i','o','u');
		char[] charArray = a.toCharArray();
		char temp;
		int i=0,j=charArray.length-1;
		while (i < j) {
			if (vowelList.contains(charArray[i])) {
				while (j >= 0) {
					if (vowelList.contains(charArray[j])) {
						temp = charArray[j];
						charArray[j] = charArray[i];
						charArray[i] = temp;
						j--;
						break;
					}
					j--;
				}
			}
			i++;
		}
		return new String(charArray);
	}
}	
