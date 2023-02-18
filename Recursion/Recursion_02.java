package DSA_Pratices;

public class Recursion_02 {
	
	// Given an integer, find out the sum of its digits using recursion

	public static int SOD(int n) {
		
		// Base Case
		if(n>=0 && n<=9) {
			return n;
		}
		
		// recursive work -> small ans
		
		int smallans = SOD(n/10);
		
		// self work
		return smallans + n%10;
	}
	
	
	/// Given two numbers p and q, find p^q using recursion.

	public static int power(int a, int b) {
		// Base Case
		if(b==0) {
			return 1;
		}
		
		// recursion
		power(a, b-1);
		
		return power(a, b-1) * a;	
	}
	
	 //Alternate 
	
	public static int Alt_power(int a, int b) {
		// Base Case
		if(b ==0) return 1;
		int smallpow = Alt_power(a, b/2);
		
		if(b %2 ==0) {
			return smallpow * smallpow;
		} else { 
			return a* smallpow * smallpow;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(SOD(5));
		
		System.out.println(power(5,3));
		 
		System.out.println(Alt_power(5,3));

	}

}
