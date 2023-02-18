package Complete_DSA;

public class Arrays_06 {
	
	
	/// **** Reverse an array ****
	
	static int printarray(int[] arr1) {
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		return 0;		
	}
	

	static void reverseArrays(int [] arr) {
		int n = arr.length;
		int j=0;
		int [] ans = new int[n];
		
		for(int i=n-1; i>=0; i--) {
			ans[j] = arr[i];
			  j = j+1;
		}
		
		for(int i=0; i<n; i++) {
		 System.out.print(ans[i] + " ");	
	}
}


	public static void main(String[] args) {
		int [] arr2 = {4, 6, 3, 5, 8, 1};		

//		
//      int n = arr1.length;		
//		for(int i=n-1; i>=0; i--) {
//		System.out.print(arr1[i] + " ");

		
     	reverseArrays(arr2);
      }
	}
	
