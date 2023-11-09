import java.util.Scanner;
public class DisplayArray_Recursion {
    static void arraydisplay(int arr[], int size){
        if(size == arr.length){
            return;
        }
        int a = arr[size];
        System.out.println(a);
        arraydisplay(arr, size+1);
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

        arraydisplay(arr, 0);
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("Code be executed");
    }
 }  
}


