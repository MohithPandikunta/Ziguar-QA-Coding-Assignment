package com.powerrouter;

import java.util.Arrays;

public class Anagrams {

	private static Object String;
	private static java.lang.String Str;
	private static java.lang.String str1;

	public static void main(String[] args) {
		
		
		String = Str = "Welcome";
		
		String = str1 = "ceelmow";
		
		// Convert Upper Case into LowerCase
		
		Str = Str.toLowerCase();
		str1 = str1.toLowerCase();
		
		// Extract String into Char type
		

		char c1[] = Str.toCharArray();
		char c2[] = str1.toCharArray();
		
		if (c1.length != c2.length) {
			System.out.println ("Not An Anagram");
			System.exit(0);
		}
		
		// Sorting a Character
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for (int i = 0; i<c1.length; i++) {
			if (c1[i] != c2[i]) {
				System.out.println("Not An Anagram");
				System.exit(0);
			}
		}
		
	System.out.println("Anagram");

	}

}


/* The Anagrams method takes two strings as input, convert UpperCase into LowerCase.
 * The method converts the strings to char arrays, sorts them, and then compares the sorted arrays.
 * The main method initializes two strings ("Welcome" and "ceelmow") and calls Anagrams to check if they are anagrams.
 * The program prints whether the strings are anagrams or not.*/

