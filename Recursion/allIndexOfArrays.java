import java.util.ArrayList;
import java.util.Scanner;
public class allIndexOfArrays {
    
public static ArrayList<Integer> allIndexFind2(int arr[], int size, int f){

        if(size == arr.length){           
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> indxf = allIndexFind2(arr, size+1, f);
        if(arr[size] == f){
         indxf.add(size);
         return indxf;
        }
        return indxf; 
    }  

 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter length of Array: ");  
        int n = sc.nextInt();
        int arr[] = new int[n];

        int i=0;
        while(n>i){
            System.out.print("Enter Element in index "+i + " : ");
            int el = sc.nextInt();
            arr[i] = el; 
            i++; 
        }
        
        System.out.print("Enter element to finding: ");  
        int f = sc.nextInt();

        System.out.println(allIndexFind2(arr, 0, f));
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("Code be executed");
    }
  }   
}