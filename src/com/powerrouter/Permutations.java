package com.powerrouter;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
    private static Set<String> permutations = new HashSet<>();

    public static void main(String[] args) {
        String input = "CAT";
        generatePermutations("", input);
        printPermutations();
    }

    static void generatePermutations(String prefix, String remaining) {
        int length = remaining.length();
        if (length == 0) {
            permutations.add(prefix);
            return;
        }
        for (int i = 0; i < length; i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutations(newPrefix, newRemaining);
        }
    }
    static void printPermutations() {
        
        for (String permutation : permutations) {
            System.out.print(permutation + " ");
        }
    }
}



/* A brief description of the solution:- 
 * 
 * Prints all unique permutations of a given string ("CAT").
 * The printPermutations method prints the generated permutations. 
 * The final output displays all permutations of the input string.
*/




