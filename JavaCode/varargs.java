package JavaCode;

public class varargs {
//	static int sum(int a, int b) {
//		return a+b;	
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a+b+c;	
//	}
//	
//	static int sum(int a, int b, int c, int d) {
//		return a+b+c+d;	
//	}
//      public static void main(String[] args) {
//		
//		System.out.println("welcome to UPES");
//		System.out.println("the sum of 4 & 5 is: " + sum(4, 5)); 
//		System.out.println("the sum of 4, 6, 8 is: " + sum(4, 6, 8)); 
//		System.out.println("the sum of 4, 6, 9, 88 is: " + sum(4, 6, 9, 88)); 

	
	
//	static int sum(int x, int ...arr){
//		// Available as int [] arr;
//		int result = x;
//		for(int a:arr) {
//			result +=a;
//		}
//		return result;
//		
//	}
//
//	public static void main(String[] args) {
//		
//		System.out.println("the sum of 4 & 5 is: " + sum(4, 5)); 
//		System.out.println("the sum of 4, 6, 8 is: " + sum(4, 6, 8)); 
//		System.out.println("the sum of 4, 6, 9, 88 is: " + sum(4, 6, 9, 88)); 
//
//
//	}
//
//}

	
	
	
	
	
	
	
	
	
	static int fibonacci(int y) {
		int W=0;
		int [] Z = new int[y];
		for(int i=0; i<y; i++) {
			if(i<1) {
				Z[i] = 0;
				W = W+ Z[i];
				
			}
			else if(i<2) {
				Z[i] = i;
				W = W + Z[i];
				
			}
			else if (i>=3){
				Z[i] = Z[i-1] + Z[i-2];
				W = W + Z[i];
			
				
			}}
		return W ;		
}
	public static void main(String[] args) {
		int x = 10;
		System.out.println(fibonacci(x));
		
		
		

	}

}
