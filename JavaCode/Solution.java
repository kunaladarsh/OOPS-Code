package JavaCode;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
    	   
    		    Scanner sc = new Scanner(System.in);
    		    int N = sc.nextInt();
    		    int [] A = {1, 2, 3, 5};
    		    
    		    int l = A.length;
    		    int n = Math.floorDiv(l, 2);
    		    
    		    for(int i=0; i<n; i++){
    		        int temp = A[i];
    		        A[i] = A[l-i-1];
    		        A[l-i-1]= temp;
    		    }
    		    for(int element: A){
    		        System.out.print(element + " ");
    		        
    		        
    		    }
    		    
    		   }  
     }
    		    
