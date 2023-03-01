package DSA_Pratices;

public class Recursion_06 {
	
	static void printarray(int[] arr, int idx) {
		if(idx == arr.length) {
			return;			
		}
		
		System.out.println(arr[idx]);
		printarray(arr, idx+1);
	}
	
	static int MaxElement(int [] arr, int idx) {
		
		if(idx == arr.length) {
			return 0;
		}
		if(idx == arr.length-1) {
			return arr[idx]; 
		}
		
		// small problem
		int smallans = MaxElement(arr, idx+1);
		
		
		// self work and final ans
		return Math.max(arr[idx], smallans);
}
	
static int MinElementInArray(int [] arr, int idx) {
		
		if(idx == arr.length) {
			return 0;
		}
		if(idx == arr.length-1) {
			return arr[idx]; 
		}
		
		// small problem
		int smallans = MinElementInArray(arr, idx+1);
		
		
		// self work and final ans
		return Math.min(arr[idx], smallans);
}
	
	

	public static void main(String[] args) {
		
		int [] arr = {5, 36, 7, 8, 9, 133, 11, 34, 55, 167};
		int [] arr1 = {};
		System.out.print("Maximum Element in Array: ");
		System.out.println(MaxElement(arr, 0));
		
		System.out.print("Minimum Element in Array: ");
		System.out.println(MinElementInArray(arr, 0));
		
	}

}
