import java.util.Scanner;
public class maxElementOfArray {
    public static int maxel(int arr[], int size){
        if(size == arr.length-1){
            return arr[size];
        }
        int max1 = maxel(arr, size+1);
        if(max1 < arr[size]){
           return arr[size];
        }else{
            return max1;
        }
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
        System.out.println(maxel(arr, 0));
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("Code be executed");
    }
  }   
}