package DSA_Pratices;

import java.util.Scanner;

public class Recursion_01 {
	// print all natural no. from n to 1 using recursion
	static void pDec(int n1) { // 5 4 3 2 1
		// Base case
		if(n1 ==1) {
			System.out.println(n1);
			return;
		}
		// self work
		System.out.println(n1); 
		
		// recursion work
		
		pDec(n1-1); 
		
	}
	
	
	
// Print all natural numbers 1 to n using recursion
	static void pIn(int n) {
		
		if(n == 0) {
			System.out.println(n);
			return;
		}
		pIn(n-1);
		System.out.println(n);
		
		
	}
	
	
// PROGRAM TO FIND 5!
	
	static int factorial(int m) {
		if(m==0) {
			return 1;
		}
		
		int ans = m * factorial(m-1);
		return ans; 
	}
	
	
	public static void main(String[] args) {
		
		// pDec(n1);
		
		System.out.println(factorial(5));
		

	}

}
