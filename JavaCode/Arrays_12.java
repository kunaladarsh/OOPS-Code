package Complete_DSA;

public class Arrays_12 {
	
	///// Given an integer array 'a', return the prefix sum/running sum
	static void prefix_sum(int[] arr) {
		int n = arr.length;
		int[] pref = new int[n];
		pref[0] = arr[0];
		
		for(int i=1; i<n; i++) {
			pref[i] = pref[i-1] + arr[i];
		}
	}
	
	
	
	//// Given an integer array 'a', return the prefix sum/running sum in the same array.

	static void prefix_sum_SameArrays(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		printarray(arr);
		
	}
	
	
	
	/*For a given array of integers of size n, answer q queries to print
	           the sum of values in a given range of indices from l to r */

	static void SumValueIndicesOfArrays(int[] arr, int l, int r) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		
	     int sum = arr[r]-arr[l-1];
	     System.out.println(sum);
	}
	
	
	// printArrays Methods
	static void printarray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
	

	
	public static void main(String[] args) {
		int [] arr5 = {1, 2, 3, 8}; 

		System.out.println("Prefix sum of Arrays");
		prefix_sum_SameArrays(arr5);
		
		int [] b = {1, 2, 3, 9}; 
		System.out.println(" ");
		System.out.println("Prefix sum");
		prefix_sum(b);
		
		SumValueIndicesOfArrays(arr5, 1, 3);
   }

}
