package Complete_DSA;

public class Arrays_2D_01 {
	
	static void print2D_Array(int [][]arr) {
		System.out.print("{");
		for(int i=0; i<arr.length; i++) {
			System.out.print("{");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if(j<arr[i].length-1) {
					System.out.print(",");
				}
			}
			if(i<arr[i].length-1) {
			System.out.println("},");
		}}
		System.out.print("}}");
	}
	
	static void elementCheck(int[][] arr, int x) {
		
		int r1 = arr.length;
		int c1 = arr[0].length;
		
		for(int i=0; i<r1; i++) {
			for(int j =0; j<c1; j++) {
				if(arr[i][j] == x) {
					System.out.println("row:" + i + " column:" + j);		         
				}				
		    }
		}
    }
	
static void reverse_2DArray(int[][] arr) {
		
		int r1 = arr.length;
		int c1 = arr[0].length;
		
		int ans[][] = new int[r1][c1];
		
		for(int i=0; i<r1; i++) {
			for(int j =0; j<c1; j++) {
			 	ans[i][j] = arr[i][c1-j-1];
		 }
		}
		print2D_Array(ans);
		
	}


	public static void main(String[] args) {
		
		int arr[][] = {{3,4, 1}, {2,5,1}, {7,9 ,0}};

		System.out.println("Element Check");
        elementCheck(arr, 1);
        
        System.out.println("");
        System.out.println("Reverse the Array");
		reverse_2DArray(arr);
		
	}

}
