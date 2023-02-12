package JavaCode;
import java.util.Scanner; 

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the first no.");
	int a = sc.nextInt();
	
	System.out.println("Enter the second no.");
    int b =sc.nextInt();
	
   int sum =  a +  b;
   
   System.out.println("totao sum =  " + sum);
	}

}
