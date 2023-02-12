package JavaCode;
import java.util.Scanner;
public class praticesSet1 {
@SuppressWarnings("resource")
public static void main( String[] arg) {

	/*
	/////////////////////problem 1
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total no. of exam: ");
	int totalnum = sc.nextInt();
	
	System.out.println("Enter the no. of Subject_1 :" );
	float sub1 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subject_2 :" );
	float sub2 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subject_3 :" );
	float sub3 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subject_4 :" );
	float sub4 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subject_5 :" );
	float sub5 = sc.nextFloat();
	
	float Gnum = sub1 +sub2 +sub3 + sub4 + sub5;
	
	float percentage = (Gnum * 100) / (int) totalnum;
	
	System.out.println("You Percentage is : " +percentage);
}
}

*/  
	
	
/*
 //////////////////// problem 2
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no. of Subj1 :" );
	float sub1 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subj2 :" );
	float sub2 = sc.nextFloat();
	
	System.out.println("Enter the no. of Subj3 :" );
	float sub3 = sc.nextFloat();
	
    float Gnum = sub1 +sub2 +sub3;
	
	float percentage = (Gnum * 100) / 300;
	
	float CGPA = percentage/ (float) 9.5;
	
	System.out.println("Your CGPA is :" +CGPA);
	
}
}
*/ 
	
	
	/*
////////////////problem 3
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the your Name: ");
	String n1 = sc.next();
	 
	System.out.println("Hello " + n1 + ", have a good day.");
	} }
	*/
	
	
	
	/////////////////////problem 4
	
	/*
	 Scanner sc = new Scanner(System.in);
	 
	System.out.print("Enter the KiloMeter :");
	
	float klm = sc.nextFloat();
	
	float Miles = klm * 0.621371f;
	System.out.println("Miles = " +Miles);	
     }
    }
	
	*/
	
	//////////////problem 5
	
	/*System.out.println("Enter your Number :");
	boolean ab =sc.hasNextInt();
	System.out.println("your Number is Integer, This Statement is " +ab); */
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the optainted marks: ");
	float num = sc.nextFloat();
	System.out.println("Enter the Total marks: ");
	float totalnum = sc.nextFloat(); 
	float per = (num * 100) / (totalnum);	
	System.out.println("Your Percentage: " +per );
}}

	