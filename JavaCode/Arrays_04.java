package Complete_DSA;
public class Arrays_04 {

	
	static void findSecondMax(int arr[] ) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > mx) {
				mx = arr[i];
			}
		}
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if (arr[i]  == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		
		int mx1 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > mx1) {
				mx1 = arr[i];
			}
		}
		
		System.out.println(mx1);
	
	}
	
	
	public static void main(String[] args) {
		int [] arr1ays= {19, 12, 12, 13, 15, 1, 0, 80, 900};
		
		findSecondMax(arr1ays);
         System.out.println("welecomes");
	}
}


 

