package com.powerrouter;
import java.util.HashMap;

public class LongestSubstring {
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        int start = 0;
        int maxLength = 0;
        int maxStart = 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, i);

            int currentLength = i - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "Welcome to PowerRouter.";
        String result = findLongestSubstring(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + result);
    }
}


/* Prints the longest substring without duplicate characters from a given input string using the 
 * sliding window technique and a HashMap for character tracking. 
 * In the provided example, it correctly outputs "Welcome" for the input "Welcome to PowerRouter."*/
