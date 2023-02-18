package Complete_DSA;

public class Arrays_2D_04 {
	
	/// method-1
	
	static int findsum(int [][]arr, int l1, int r1, int l2, int r2) {
		int sum =0;
		for(int i=l1; i<r1; i++) {
			for(int j=l2; j<r2; j++) {
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	
	
	
	static void findPrefixSumMatrix(int [][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		
		// traverse horizontally to calculate row-wise prefix sum
		for(int i=0; i<r; i++) {
			for(int j=1; j<c; j++) {
				arr[i][j] = arr[i][j] + arr[i][j-1];
			}
		}
	}
	
	
	// method_2 
	
	static int prefixSum(int [][]arr, int l1, int r1, int l2, int r2) {
		int sum =0;
		findPrefixSumMatrix(arr);
	
		for(int i=l1; i<= r1; i++) {
			// r1 to r2 sum for row i
			if(r1 >= 1) {
				sum += arr[i][r2] - arr[i][r1-1];
				}
			else {
				sum += arr[i][r2];
			}
		}
		
		return sum;
	}
	
	
	// method_3
	static int prefixSum2(int [][]arr, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up=0, left=0, leftup=0;
        findPrefixSumMatrix(arr);
        
        sum = arr[l2][r2];
        if(r1 >= 1) {
            left = arr[l2][r2-1];
        }
        
        if(l1 >= 1) {
            up = arr[l1-1][r2];
        }
        
        if(l1 >= 1 && r1 >= 1) {
            leftup = arr[l1-1][r1-1];
        }
        
        ans = sum -up -left + leftup;
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("sucessfull");

	}

}
