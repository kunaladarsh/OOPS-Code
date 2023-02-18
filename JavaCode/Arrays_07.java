package Complete_DSA;

public class Arrays_07 {
	
	// swap using temporary variable
	
	static void SwapTempVar(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

	
	/// """"Swap using sum and difference""""
	
	static void SwapUsingSD (int a, int b) {
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
	
		SwapTempVar(2, 5);
		
		
		SwapUsingSD(5, 9);
	
		
		

	}

}
