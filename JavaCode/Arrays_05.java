package Complete_DSA;

public class Arrays_05 {
	
	static void SwapValue(int [] arr, int x, int y) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				arr[i] =y;
				break;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]== y) {
				arr[j] = x;
				break;
			}	
		}}

		for(int i1=0; i1<arr.length; i1++) {
			System.out.print(arr[i1] + " ");
			
		}
	}
		

	public static void main(String[] args) {
		
		
	int[]arr1 = {1, 2, 4, 5, 6, 7, 8};
	
	SwapValue(arr1, 2, 7);
	}
}
