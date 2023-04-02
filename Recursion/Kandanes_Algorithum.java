package DSA_Pratices;

/*Given an array Arr[] of N integers. Find the contiguous sub-array
 * (containing at least one number)which has the maximum sum and return 
 * its sum.
 * Input:N = 5
    Arr[] = {1,2,3,-2,5}
   Output:
    9
 */

public class Kandanes_Algorithum {

   static long maxSubarraySum(int arr[], int n){
    long sum = 0, 
    max = Long.MIN_VALUE;

     for(int i=0;i<n;i++) {

      sum+=arr[i];

      max = Math.max(sum, max);
      if(sum > max){
         max = sum; 
      }

      if(sum<0) {

      sum=0;

      }

     }

     return max; 
    

    
     // Second Methods
     
 //     // Your code here
 //     int k = (n*(n+1))/2;
 //     int l =0;
 //     int ans[] = new int[k]; 
     
 //     int sum =0;
 //     for(int i=0; i<n; i++){
 //         for(int j=i; j<n; j++){
          
 //          if(i==j){
 //          sum = arr[j];  
 //          }
          
 //          else{
 //           sum = sum + arr[j];
 //          }
          
 //          ans[l] = sum;
 //          l++;
 //         }
        
 //     }
     
 //     Arrays.sort(ans); 
 //     return (ans[k-1]);
     
 // 
  }

	public static void main(String[] args) {
		
		int Arr[] = {1,2,3,-2,5};
		int n = Arr.length;
		 System.out.println(maxSubarraySum(Arr, n));
	}

}
