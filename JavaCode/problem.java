package JavaCode;
import java.util.Scanner;


public class problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int income = 0;
		
		System.out.println("Enter the your Income: ");
		int n = sc.nextInt();
		
		if (n<=2500000);{
			System.out.println("You have pay no TAX");
		}
		if(n>2500000 && n<=500000);{
			int y = (int) (n + 0.05*(income- n));
			System.out.println("you have pay to tax: "+ y);
		}
		
		if(n>500000 && n<=1000000);{
			int p= (int)(n + 0.20*(income- n));
			System.out.println("you have pay to tax: "+ p);
	
		}
		
		if(n>1000000);{
			int q= (int)(n + 0.30*(income- n));
			System.out.println("you have pay to tax: "+ q);

		}
		}
	


	}


