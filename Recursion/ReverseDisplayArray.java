import java.util.Scanner;

public class ReverseDisplayArray {
  
static void arraydisplay_reverse(int arr[], int size){
        if(size == arr.length){
             return;
         }
         arraydisplay_reverse(arr, size+1);
         System.out.println(arr[size]); 
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
         arraydisplay_reverse(arr, 0);
    } catch(Exception e) {
        System.out.println(e);
    }   
  }
}
