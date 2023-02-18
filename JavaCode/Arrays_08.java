package Complete_DSA;


public class Arrays_08 { 

	// **** Rotate the array by 'k' steps ****
	
	static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		int[] ans = new int[n];
		int j = 0;
		
		for(int i = n-k; i<n; i++) {
			ans[j] = arr[i];
			System.out.print(ans[j] + " ");
			j++;
		}
		
		for (int i =0; i< n-k; i++) {
			ans[j] = arr[i];
			System.out.print(ans[j] + " ");
			j++;
		}
	}
	
	
	
	// **** Rotate the array by 'k' steps without  extra space ****
	
	static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	
	
	static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	static void rotateInPlace(int[]arr, int k) {
		int n = arr.length;
		k = k%n;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
	}
	


	
	

   /// print the Arrays
	
	static void printarray(int[] arr) {
		int n = arr.length;
			for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}	
	}

	
	public static void main(String[] args) {
      int [] arr1 = {1, 2, 3, 4, 5, 6, 7};
      
      rotateInPlace(arr1,5);
      printarray(arr1);
		
		
	}

}
