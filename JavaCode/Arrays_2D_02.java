package Complete_DSA;

public class Arrays_2D_02 {
	
	/// Transpose of matrix
	
	static void transponse_matrix(int [][] arr) {
		int r1 = arr.length;
		int c1 = arr[0].length;
		int ans[][]= new int[c1][r1];
		
		for(int i=0; i<c1; i++) {
			for(int j=0; j<r1; j++) {
				ans[i][j] = arr[j][i];
			}
		}
		print2D_Array(ans);
	}
	
	
	/// Transpose of matrix inplace logic
	static void inplace_Transpose(int [][]arr) {
		
		int r1=arr.length;
		int c1=arr[0].length;
		
		for(int i=0; i<c1; i++) {
			for(int j=i; j<r1; j++) {
				//swap arr[i][j], arr[j][i]
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}			
	}
	
	static void Pascal_triangle(int n) {
		
		int arr[][] = new int[n][];
		
		for(int i=0; i<n; i++) {
			 arr[i]= new int[i+1];
			 arr[i][0] = 1;
			 
			 for(int j=0; j<=i; j++) {			 
			if(j==i)
	     	 arr[i][j] =1;
				
			if(j>0 && i>j){ 
			  arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			   }
			}	
		}
		print2D_Array(arr);

	}
	
	
	///  Rotate a matrix 90 degrees clockwise
 
	
	static void print2D_Array(int [][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
	
	
	 public static void sort012(int a[], int n)
	    {
	        int k = a.length;
	        int b=0; // 0s
	        int c=0; // 1s
	      for(int i=0; i<k; i++){
	          if(a[i]==0){
	              b++;
	          }
	          
	          if(a[i]==1){
	              c++;
	          }
	      }
	      
	      for(int i=0; i<k; i++){
	         if(i<b){
	          a[i]=0;
	          }
	         else if(i>=b || i<c){
	            a[i]=1;
	         }
	         else{
	            a[i] =2;
	        }
	      }
	        
	    }
	 
	 
	 
	 
	 /// leaders in a arrays
	 
	 //Function to find the leaders in the array.
		    static void leaders(int arr[]){
		      
		      int n= arr.length;
		      int y1 = 0;
		      
		      for(int i=0; i<n; i++){
		          for(int j=i; j<n-1; j++){
		           if(arr[i] > arr[j+1]){
		              y1 = arr[i];
		           }
		          }
		          System.out.println(y1);

		          
 }
		      }

	
	
	public static void main(String[] args) {
		
		int arr1[][] = {{1,4,0}, 
				        {2,5,0}, 
				        {7,9,0}};
        System.out.println("");
		System.out.println("Transpose_Matrix");
		transponse_matrix(arr1);
		print2D_Array(arr1);
		
		
		int arr[][] = {{5,6,0}, 
		        {1,5,6}, 
		        {7,9,8}};
		System.out.println("");
		System.out.println("Inplace_Transpose");
		inplace_Transpose(arr);
		print2D_Array(arr);
		
		 System.out.println(" ");
		System.out.println("Pascal Traingle");
	 	Pascal_triangle(5);
		
		
		int a[] = {0, 1, 1, 2, 0, 0, 0, 2};
		System.out.println(" ");
		System.out.println("Sorting the array");
		sort012(a, 0);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int b1[] = {16, 17, 4, 3, 5, 2};
		System.out.println("");
		System.out.println("Learder of ARRAY");
		leaders(b1);
		
	}

}
