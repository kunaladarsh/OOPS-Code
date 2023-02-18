package Complete_DSA;

public class Arrays_10 {

	/// print the Arrays method
			static void printarray(int[] arr) {
				int n = arr.length;
					for(int i =0; i<n; i++) {
					System.out.print(arr[i] + " ");
				}	
			}
			
			
	/// swaping method	
		      static void swap(int[] arr, int i, int j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
	   
		      
    //// In an array 'a' move all even integers at the beginning followed by all odd integer
		  	static void SortArrayByParity(int [] arr) {
				
				int n = arr.length;
				
				int left = 0;
				int right = n-1;
				
				while(left<right) {
					if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
						swap(arr, left, right);
						left++;
						right--;
						
						}
					if(arr[left] % 2 == 0) {
						left++;
					}
					
					if(arr[right] % 2 == 1) {
						right--;
					}
					
					}
				printarray(arr);
				}
	      
		  	

	
	public static void main(String[] args) {
		
	int[] arr2 = {2, 3, 4, 5, 7, 8, 9, 12, 14, 15, 16}; 
	
	SortArrayByParity(arr2);
	
	
	// printarray(arr2);
	
	}

}
