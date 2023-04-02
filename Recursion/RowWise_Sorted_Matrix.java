package DSA_Pratices;

import java.util.Arrays;

/*
 * Given a row wise sorted matrix of size R*C 
 * where R and C are always odd, find the median 
 * of the matrix.


 */

public class RowWise_Sorted_Matrix {
		  static int median (int matrix[][], int R, int C){
	        int k = R*C;
	        int arr[]= new int[k];
	        int a =0;
	        for(int i=0; i<R; i++){
	            for(int j=0; j<C; j++){
	                
	                arr[a] = matrix[i][j];
	                 a++;
	            }
	        }
	        Arrays.sort(arr);
	        int h =arr.length/2;
	        return arr[h];


	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1, 3, 5}, 
		                {2, 6, 9}, 
		                {3, 6, 9}};
		 System.out.println(median(arr, 3,3));


	}

}
