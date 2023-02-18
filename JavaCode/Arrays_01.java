package Complete_DSA;
import java.util.*;




public class Arrays_01{
	
	
	static void smallestAndLargestElement(int[] arr) {
		
		int l =0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>l){
				l = arr[i];
			}
		}
		
		int s = arr[0];
		for(int i=0; i<arr.length; i++) {
			arr[0]=s;
			if(arr[i]<s) {
				s = arr[i];
			}
			}
		
		System.out.print("[" + s);
		System.out.print(", ");
		System.out.println(l+"]");
		
	}
	
	
	
	
	static void isShorted(int[] arr) {
		int check = 1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				check = 0;
			    break;	
			}
		}
		 if(check==1) {
		 System.out.println("Array is Shorted");
		 }
		 else {
			 System.out.println("Array is not Shorted");
		 }
	}
	
	
	
	
	static void numberOfElementStrictlyGreater(int[] arr, int x) {
		int num =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>x) {
				num = num+1;
			}
		}
		System.out.println(num);
	}
	
	
	static void lastOccurrence(int[] arr, int x) {
		int lastIndex = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				lastIndex = i;
			}
		}
		System.out.println(lastIndex);
	}

	
	static void countarray(int[] arr, int x) {
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	static void printarray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	 

	public static void main(String[] args) {
		
		int arr1[] = {8, 2, 4, 5,6, 0, 1, 1};	
		int ans = 91;
		for (int i=0; i< arr1.length; i++){
			if(arr1[i] == ans) {
				System.out.println("Found " + ans +" index " + i);
				break;
			 }
		}
		 
			if (ans != 1){
			System.out.println("Not Found");
				
			}

		
		
		
		
		
		
			// 2D Array
			int [][] arr2 = {{19, 12, 2, 13},
			                {18, 20, 21, 55}};
			
			int b2=0;
			for(int i=0; i<arr2.length; i++){
				for(int j=0; j<=arr2.length+1; j++) {
				
				int temp = arr2[i][j];
				if(temp >= b2){
					b2 = temp;
				}	
			  }
		    }
			System.out.println("Largest no. of 2D array: " + b2);
			
			for(int i=0; i<arr2.length; i++){
			for(int j=0; j<=arr2.length+1; j++) {
				if(arr2[i][j] == b2) {
					System.out.println("Found " + b2 + " index " + i +" "+ j);
					break;
				}
				
			}
			}

		
		
		
		
		
		
		
		

		//Taking arrary input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr3 = new int[n];
		
		System.out.println("Enter " + n+ " element");
		for(int i=0; i<arr3.length; i++) {
			//System.out.print("arr3["+i+"] = ");
			arr3[i]= sc.nextInt();
			
			
		}
		
		System.out.println("sucessfull");
		
	
		
		
		
		
		
		int [] arr11 = {19, 12, 12, 13, 15, 1, 0, 18, -1, 1, 19};
		System.out.println("original arr1");
		printarray(arr1);
		
		// copy the element to other array
		 int[] arrcopy = arr11.clone();
		 System.out.println("copied arrcopy");
		 printarray(arrcopy);
		 
		
		 arrcopy[3]=0;
		 arrcopy[4]=0;
		 arrcopy[5]=0;
		 
		 System.out.println("copied arrcopy after changing");
		 for (int i=0; i<arrcopy.length; i++) {
				System.out.print(arrcopy[i] + " ");
			}
			System.out.println(" ");
		 
			
		 System.out.println("original arr2 after changing");
		 for (int i=0; i<arr11.length; i++) {
				System.out.print(arr11[i] + " ");
			}
			System.out.println(" ");
		
		
		
		
		
		
		
		
		

		int [] arr5 = {19, 12, 12, 13, 15, 1, 0, 18, -1, 1, 19, 12};
		
		int count = 0;
		int x=12;
		for(int i=0; i<arr5.length; i++) {
			if(arr5[i]==x) {
			   count = count+1;
			}
		}
		System.out.println(count);
		
		// using FUNCTION 
		countarray(arr5, 1);
		
		
		//find last occurrence
		System.out.print("last occurrence of x in array is : ");
		lastOccurrence(arr5, 1);
		
		
		
		//find number of element strictly greater then value
		System.out.print("number of element strictly greater then x: ");
		numberOfElementStrictlyGreater(arr5, -1);
		
		int [] arrr5 = {1, 2, 4, 4, 5, 10, -15, 98, 5, 0};
		
		Arrays.sort(arrr5);
		printarray(arrr5);
		
		
		isShorted(arrr5);
		
		
		smallestAndLargestElement(arrr5);
		
	}
}



