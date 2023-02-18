package Complete_DSA;

public class Arrays_11 {


	/// For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order

	static void sortSquared1(int[] arr) {
		int n= arr.length;
		int left =0, right=n-1;
		int k = 0;
		int[] ans = new int[n];
		
		
		while(left <= right) {
			if( Math.abs(arr[left]) > Math.abs(arr[right])){
				ans[k++] = arr[left] * arr[left];
				left++;
			}else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		for(int i =ans.length-1; i>=0; i--) {
			System.out.print(ans[i] + " "); 
			}
		}
		
	
	public static void main(String[] args) {
     
	int [] arr5 = {-9, -5, -3, 7, 9};
	
	sortSquared1(arr5);
	
	}

}
