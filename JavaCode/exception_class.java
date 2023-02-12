package JavaCode;
import java.util.Scanner;

class Myexception extends Exception
{
	public String toString() {
		return super.toString() + "I am to string()";
	}	
	
	public String getMessage() {
		return super.getMessage() + " I am getMessage() ";
	}
}


public class exception_class {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    if (a<99) {
    	try {
    	throw new Myexception();
    }
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    		System.out.println(e);
    		e.printStackTrace();
    		System.out.println("hello");
    	}
    }
}}
