package JavaCode;

public class method {
	

	static int logic(int x, int y) {
		int z;
		if (x>y) {
			z =(x+y)+5;
			}
			else {
				z=(x+y) *5;
			}
		return z;
		}
	
	
	 static String multiplyStrings(String s1, String s2)
	    {
	     int x = Integer.parseInt(s1);
	     int y = Integer.parseInt(s2);
	     int z = x*y;
	     String x1 = String.valueOf(z);
	      return x1;
	        
	    }
	
	public static void main(String[] args) {
		int a =4;
		int b =5;
		
		String a1 = "10";
		String b1 = "15";
		String c3;
		
		// method invocation using object creation
	    // method obj = new method();
		
		int c= logic(a,b);
		
		c3 = multiplyStrings(a1,b1);
		System.out.println(c3);	
	}	
}


