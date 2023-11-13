import java.util.Scanner;
public class firstIndex {
    public static int firstIndexFind(int arr[], int size, int f){
        if(size== arr.length){           
            return -1;
        }
        int indx = firstIndexFind(arr, size+1, f);
        if(arr[size] == f){
            return size;
        }else{
            return indx;
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
        
        System.out.println("Enter element to finding: ");  
        int f = sc.nextInt();

        System.out.println(firstIndexFind(arr,  0, f));
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("Code be executed");
    }
  }   
}