package com.powerrouter;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Welcome";
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
			
		}
	}
}


/* Input String: "Welcome".
 * The string is converted into a character array (char[] ch).
 * A loop iterates from the last character to the first character (for (int i = ch.length - 1; i >= 0; i--)).
 * Characters are printed in reverse order.
 * Output String: The reversed string is printed as "emocleW".*/