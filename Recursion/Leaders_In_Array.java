package DSA_Pratices;
import java.util.ArrayList;
import java.util.Collections;


/* Given an array A of positive integers. Your task is to find the leaders in the array.
 * An element of array is leader if it is greater than or equal to all the elements to its 
 * right side. The rightmost element is always a leader.
 * 
 *  Input:
    n = 5
    A[] = {1,2,3,4,0}
    Output: 4 0
 */

public class Leaders_In_Array {	
	    
	    static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        int max = arr[n-1];
	        list.add(max);
	        
	        for(int i = n-2; i>=0; i--){
	            if(arr[i] >= max){
	                list.add(arr[i]);
	                max = arr[i];
	            }
	        }
	        
	        Collections.reverse(list);
	        
	        return list;
	    }


	


	public static void main(String[] args) {
	int A[] = {16,17,4,3,5,2};
	System.out.println(leaders(A, 6));
	
	}

}
