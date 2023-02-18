package Complete_DSA;

public class Arrays_09 {

	   /// print the Arrays
		static void printarray(int[] arr) {
			int n = arr.length;
				for(int i =0; i<n; i++) {
				System.out.print(arr[i] + " ");
			}	
		}

	
	/// Problems based on two pointers
	/// Sort an array consisting of only 0s and 1s 
	
	static void sortArrayZeroesAndOne(int[]arr) {
		int n = arr.length;
		int Zeroes = 0;
		
		for(int i = 0; i<n; i++) {
			if(arr[i]== 0){
				Zeroes++;	
			}
		}
		
		for(int i=0; i<n; i++) {
		
		if(i<Zeroes) {
		arr[i]=0;
		}
		else {
			arr[i] = 1;
		}
	  }
		printarray(arr);
	}
	
	
	
	/// methods_2
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	
	static void SortZeroesAndOnes(int [] arr) {
		
		int n = arr.length;
		
		int left = 0;
		int right = n-1;
		
		while(left<right) {
			if(arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
				
				}
			if(arr[left] == 0) {
				left++;
			}
			
			if(arr[right]== 1) {
				right--;
			}
			
			}
		printarray(arr);
		}
	
	
	
    static void gfSeries(int N){
        
        int tn =0;
        int tn1 =0;
        for(int i=1; i<=N; i++){
            if(i==1){
                System.out.print(0 + " ");
                
            }
            if(i==2){
                System.out.print(1 + " ");
                tn1 = 1;
            }
            
            if(i>=3){
              int tm = tn*tn - (tn1); 
                tn = tn1;
                tn1 = tm;
                System.out.print(tm + " ");
            }
        }
    }

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr= {1, 0, 1, 0, 1, 0, 1};		
//	
//         	
//		SortZeroesAndOnes(arr);
//		printarray(arr);
		
		gfSeries(6);
	}

}
