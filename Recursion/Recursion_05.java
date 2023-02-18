package DSA_Pratices;

import java.util.ArrayList;

public class Recursion_05 {

	/// given an array of n integer and a target value x. Print whether x exits in the array ot not
	
	// Constraints: 0<=n <=le6, -le8 <=x <= le8, -le8 <= a[i] ,= le8
	// Input1 = n=8, x =14, array = [4, 12, 54, 14, 3, 8, 6, 1]
	// Output1 = Yes
	
	static boolean search(int[] a, int target, int idx) {
		
		// base case
		if(idx >= a.length) {
			return false;
		}
		
		// self work
		if (a[idx] == target) return true; 
		
		// recursive work
		if (search(a, target, idx+1)) {
			return true;
		} else {
			return false;
		}}	
	
	
	
	/// Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array
	
	static void findAllIndices(int[] a, int n, int target, int idx) {

	// base case
	if(idx >= n) {
		return;
	 }
	
	// Self work
	if(a[idx] == target) {
		System.out.println(idx);
	}
	
	// recursive work 
	findAllIndices(a, n, target, idx+1);
 }	
	
	
	//////
	static ArrayList<Integer> allIndices(int[] a, int n, int target, int idx){
		
		if(idx >= n) {
			return new ArrayList<Integer>();  // return empty arrayList
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		// self work 
		if(a[idx] == target) {  // ans --> {}
			ans.add(idx);
		}
		
		ArrayList<Integer> smallAns = allIndices(a, n, target, idx+1);
		ans.addAll(smallAns);
		return ans;
	}
	
	
	
	////  printing an array using recursion 
	static void printArray(int[] arr, int idx) {
		
		// base case
		if(idx== arr.length) {
			return;
		}
		
		// self work
		System.out.println(arr[idx]);
		
		// recursion work - sub problem 
		printArray(arr, idx+1);
	}
	
	
	
    public static void main(String[] args) {
	     
     int [] a = {1, 2, 4, 6, 7, 8, 9};
     int target = 74; 
     
   if(search(a,  7, 0)) {
	   System.out.println("Yes");	
   } else {
	   System.out.println();
	}
     
     printArray(a, 0);
   
   
   }
}
 
