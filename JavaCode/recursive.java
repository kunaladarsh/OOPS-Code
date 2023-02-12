package JavaCode;

public class recursive {
	
	static int Fact(int n){
		int z=1;
		if(n==0 || n==1) {
			return 1;
		}
		else {
		for(int i=0; i<n-1; i++) {
			z = z * (n-i);
		}
		return z;
	}}
	
	// second method::
	static int factorial(int m) {
		
		if(m==0 || m==1){
			return 1;
		}
		else {
			return m*factorial(m-1);
		}
	}

	
	static int fibonacci(int n) {
		
		if(n==1 || n==2) {
			return n-1;	
		}
		return fibonacci(n-1)+fibonacci(n-2);
		
		
}
		
	
	public static void main(String[] args) {
		int x = 11;
		//System.out.println(Fact(x)); 
		
		System.out.println(factorial(x));
		
		System.out.println(fibonacci(x));
		
		
		

	}

}
