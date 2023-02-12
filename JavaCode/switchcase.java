package JavaCode;
import java.util.Scanner;
public class switchcase {
 
	public static void main(String[] args) {
		
		int age;
	
		
		
		
		System.out.println("Enter your age:\t");
		try (Scanner scan = new Scanner(System.in)) {
			{
				age = scan.nextInt();
				
			}
		}  
		switch(age) { 
		case 18: 
			System.out.println("you are going to become adult");
		break;
		case 20: 
			System.out.println("you are joing the jobs, thanks");
	    break; 
		case 70: 
			System.out.println("you are going to get retired, ");
		break;
		
		default:
			System.out.println("Enjoy you life");	
	  }
	} 
}
	
	