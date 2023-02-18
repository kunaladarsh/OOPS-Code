package DSA_Pratices;

public class Recursion_04 {
	
	static void GCD(int p, int q) {
		int min=0;
	
		if(p>q) {
		min = q;
		} else {
			min = p;
		}
		
		
		for(int i=min; i>=1; i--) {
		
			if( p % i == 0 && q % i == 0) {
			  System.out.println(i);
			  return;
			}
		}
	}
	
	
	//
	
	static int iGCD(int x, int y) {
		while(x % y != 0) {
			int rem = x% y;
			x = y;
			y = rem;
		}
		
		return y;
	}
	
	
	/// EUCLID'S ALGORITHUM
	   // RECURSIVE method
	static int gcd(int x, int y) {
		if(y ==0) {
			return x;
		}
		
		return gcd(y, x%y);
	}
	
	
	public static void printNos(int N)
    {
       if(N==1){
    	   System.out.println(N);
    	 return;
       }
       
       printNos(N-1);
      System.out.println(N);
    }
	
	

	public static void main(String[] args) {
		// GCD(15, 16);
		
		// System.out.println(gcd(12, 16));
		
		printNos(5);
	}

}
