import java.util.Scanner;
public class lastindex {
 public static int lastIndexFind(int arr[], int size, int f){
        if(size == -1){           
            return -1;
        }

        int indx = lastIndexFind(arr, size-1, f);
        if(arr[size] == f){
            return size;
        }else{
            return indx;
    }
 }


 // Second methods
  public static int lastIndexFind2(int arr[], int size, int f){
        if(size == arr.length){           
            return -1;
        }

        int indx = lastIndexFind2(arr, size+1, f);
        if(indx == -1){
            if(arr[size] == f){
                return size;
            }else{
                return -1;
            }
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
        
        System.out.print("Enter element to finding: ");  
        int f = sc.nextInt();

        System.out.println(lastIndexFind(arr,  arr.length-1, f));
        //Second approach methods call
        System.out.println(lastIndexFind2(arr, 0, f));
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("Code be executed");
    }
  }   
}