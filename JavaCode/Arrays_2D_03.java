package Complete_DSA;

public class Arrays_2D_03 {
	
	
	/// Spiral Matrix Traversal & Generation 
	
	static void spiralMatrix(int [][] arr, int r, int c) {
            int topRow =0, bottomRow=r-1, leftCol =0, rightCol = c-1;
            int totalElement =0;
            while(totalElement < r*c ){
                
                // topRow -> leftCol to rightCol
                for(int j= leftCol; j<=rightCol && totalElement < r*c  ; j++){
                    System.out.println(arr[topRow][j] + " ");
                    totalElement++;
                }
                topRow++;
                
                // rightCol -> topRow to BottomRow
                for(int i= topRow; i<=bottomRow && totalElement < r*c ; i++){
                    System.out.println(arr[i][rightCol]);
                    totalElement++;
                }
                rightCol--;
                
                //bottomRow -> rightCol to leftCol
                for(int j=rightCol; j>=leftCol && totalElement < r*c ; j--){
                    System.out.println(arr[bottomRow][j] + " ");
                    totalElement++;
                }
                bottomRow--;
                
                
                //leftCol -> bottomRow to topRow
                for(int i=bottomRow; i>=topRow && totalElement < r*c ; i--){
                    System.out.println(arr[i][leftCol] + " ");
                    totalElement++;
                }
                
                leftCol++;
            }
          
	}
	

	public static void main(String[] args) {

            int arr[][]= {{1, 2, 3},
                          {4, 5, 6},
                          {7,8,9}};
	
            spiralMatrix(arr, 3, 3);
            
         }
}
