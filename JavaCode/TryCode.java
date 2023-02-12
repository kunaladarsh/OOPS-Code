package JavaCode;
import java.util.*;
import java.lang.*;
import java.io.*;

public class TryCode
	{
		public static void main (String[] args) throws Exception
		{
		    
	     Scanner sc = new Scanner(System.in);
	     
	     int T = sc.nextInt();
	     for(int i=0; i<=T; i++){
	         int a = sc.nextInt();
	         int b = sc.nextInt();
	         
	         if(a>b){
	             System.out.println(a);
	         }
	         else{
	             System.out.println(b);
	         }
	     }

	   }
	}