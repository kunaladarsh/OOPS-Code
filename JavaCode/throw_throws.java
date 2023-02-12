package JavaCode;

import java.util.Scanner;


@SuppressWarnings("serial")
class NegativeRadiusException extends Exception {
	public String toString() {
		return "Radius cannot be negative";	
	}
	
	public String getMessage() {
		return "Radius cannot be negative";
		
	}
}

public class throw_throws {
	public static double area(int r) throws NegativeRadiusException{
		if (r<0){
			throw new NegativeRadiusException();
		}
		double A = Math.PI * r * r;
		return A;
		
	}
	

	@SuppressWarnings("unused")
	private static int divide(int a, int b) throws Exception{
		int result = a/b;
		return result;
		
	}
	
	
    public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Radius: ");
			int b = sc.nextInt();
			double ar = area(b);
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}

