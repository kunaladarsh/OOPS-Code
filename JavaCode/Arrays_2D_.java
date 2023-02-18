package Complete_DSA;

import java.util.*;

public class Arrays_2D_ {
	
	static void print2D_Array(int [][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
	
	static void Sum(int a[][], int r1, int c1, int b[][], int r2, int c2) {
		
		int [][] sum = new int[r1][c2];
		
		if(r1 != r2 || c1 != c2) {
			System.out.println(" Wrong Input - Addition not possible");
			return;
		}
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; i++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
			
		}
		print2D_Array(sum);
	}
	
	
static void Mutipilication(int [][]a, int r1, int c1, int [][]b, int r2, int c2) {
		
		int [][] mul = new int[r1][c2];
		
		if(c1!= r2) {
			System.out.println(" Wrong Input - Addition not possible");
			return;
		}
		
		
		for(int i=0; i<r1; i++) { // row number
			for(int j=0; j<c2; i++) {  // column number
				for(int k = 0; k< c1; k++) {
					
					/* 
					  i =1; j =0
					  mul[i][j] = ith row of a * jth col of b				 * 
					 * 
					 */
					mul[i][j] += (a[i][k] * b[k][j]);
				}
				
			}
			
		}
		System.out.println(" Multiplication of Matrix");
		print2D_Array(mul);
	}



	public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//		 System.out.println(" Enter number of rows");
//		 int r = sc.nextInt();
//		 System.out.println("Enter number of columns");
//		 int c = sc.nextInt();
//		 
//		 int [][] arr = new int[r][c]; // total = r*c
//		 
//		 System.out.println("Enter ");
//		 for(int i=0; i<r; i++) {
//			 for(int j=0; j<c; j++) {
//				 arr[i][j] = sc.nextInt();
//			 }
//		 }
//		 
		
		
      Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter number of rows and coloumns in matrix 1");
		 int r1 = sc.nextInt();
		 int c1 = sc.nextInt();
		 
		 int [][] a = new int[r1][c1]; // total = r*c
		 
		 System.out.println("Enter ");
		 for(int i=0; i<r1; i++) {
			 for(int j=0; j<c1; j++) {
				 a[i][j] = sc.nextInt();
			 }
		 }
		 
		 
		 System.out.println(" Enter number of rows and coloumns in matrix 2");
		 int r2 = sc.nextInt();
		 int c2 = sc.nextInt();
		 
		 int [][] b = new int[r2][c2]; // total = r*c
		 
		 System.out.println("Enter ");
		 for(int i=0; i<r2; i++) {
			 for(int j=0; j<c2; j++) {
				 b[i][j] = sc.nextInt();
			 }
		 }
		
		
	       
		
		Mutipilication(a, r1, c1, b, r2, c2);
		
	//	print2D_Array(arr1);
		
		
	}

}
