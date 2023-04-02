package DSA_Pratices;
import java.util.*;

/* Given two numbers as strings s1 and s2. Calculate their Product.
 *  numbers can be negative and You are not allowed to use any 
 *  built-in function or convert the strings to integers. 
*/

public class Multiply_two_strings {
	     public static String multiplyStrings(String s1,String s2)
	     {
	         //code here.
	         long a = Long.parseLong(s1);
	         long b = Long.parseLong(s2);
	         long c = a * b;
	         return Long.toString(c);
	     }
	     
		     public static void main(String[] args){
		        Scanner sc = new Scanner (System.in);
		             System.out.println("Enter the String_1: ");
		             String a = sc.next();
		             System.out.println("Enter the String_2: ");
		             String b = sc.next();
		             System.out.println(multiplyStrings(a, b)); 
     	}
  }
 
