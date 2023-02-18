package Complete_DSA;



public class Arrays_03 {
	
	// Program to find a unique number in a given array

	static void uniqueNumArr(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					arr[i] =-1;
					arr[j] =-1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] > 0){
				int n1 = arr[i];
				System.out.print(n1+ " ");
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {

	int [] arr1 = {19, 12, 12, 13, 15, 1, 8, 18, 1, 19, 10}; 
	

	uniqueNumArr(arr1);
		
	}

}
