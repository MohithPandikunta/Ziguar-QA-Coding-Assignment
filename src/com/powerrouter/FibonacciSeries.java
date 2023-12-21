package com.powerrouter;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int n1 = 0, n2 = 1;
		System.out.print (n1 + " " + n2);
		for(int i = 2; i<n; i++) {
			int sum = n1 + n2;
			System.out.print(" " + sum);
			
			//Swap
			n1 = n2;
			n2 = sum;	
		}

	}

}

/* A brief description of the solution:- 
 * 
 * This Java program defines a class (FibonacciSeries) with a main method to generate and print the first 10 numbers of the fibonacciSeries.
 * The fibonacciSeries method calculates the fibonacciSeries up to the specified length using a simple loop. 
 * The result is then printed in the main method.
*/

