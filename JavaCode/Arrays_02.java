package Complete_DSA;

public class Arrays_02 {
	
  
   // Program to find the total number of pairs in the arrays whose sum is equal to the given value x
	static void TargetSum(int[] arr, int target) {
		int n = arr.length;
		int pair =0;
		for(int i=0;  i<n; i++) {
			for(int j= i+1; j<n; j++) {
				if(arr[i]+ arr[j] == target) {
					pair++;
				}	
			}	
		}
		
		System.out.println(pair);
	}
	
	
	
   // Program to count the number of triplets whose sum is equal to the given value x
    static void tripleSum(int[] arr, int target) {
    	int n = arr.length;
    	int ans = 0;
    	for(int i=0; i < n; i++) {
    		for(int j=i+1; j<n; j++) {
    			for(int k=j+1; k<n; k++) {
    				if(arr[i]+arr[j]+arr[k]== target) {
    					ans++;
    				}
    			}
    		}
    	}
    	System.out.println(ans);
    }
    

    
	public static void main(String[] args) {
	
	int [] arr1 = {4, 6, 3, 5, 8, 2, 4};

	TargetSum(arr1, 8);
	
	
	tripleSum(arr1, 10);

	}
}
