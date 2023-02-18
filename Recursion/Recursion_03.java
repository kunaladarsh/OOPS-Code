package DSA_Pratices;

public class Recursion_03 {
	
	/// Given a number num  and a value k, print k multiples of num

	public static void k_Multi(int num, int k) {
		// base case
		if(k==1) {
			 System.out.println(num);
			 return;
		}
		
		// recursive work
		k_Multi(num, k-1);
		
		// self work
		int Fans= num * k;
		System.out.println(Fans);		
	}

	
	//// Given a number n, find the sum of natural numbers till n 
	public static int Naturalno_Sum(int n) {
		if(n==1) {
			return 1;
		}
		
		// recursive work
		Naturalno_Sum(n-1);
		
		return Naturalno_Sum(n-1) + n;
	}
	
	
	public static  int Naturalno_Sum_ALtnegative(int n) {
		if(n==0) {
			return 0;
		}
		 
		// recursive work
		Naturalno_Sum_ALtnegative(n-1);
		
		if(n%2 == 0) {
		return Naturalno_Sum_ALtnegative(n-1)  - n;
	  } else { 
		  return Naturalno_Sum_ALtnegative(n-1) + n;
 	
	  }
	}
	
	
	
	public static void main(String[] args) {
		k_Multi(5, 5);
		// System.out.println(Naturalno_Sum(10));
		
		System.out.println(Naturalno_Sum_ALtnegative(5));

	}

}
