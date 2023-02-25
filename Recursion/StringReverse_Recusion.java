package Complete_DSA;

public class StringReverse_Recusion {
	/// print a string in reverse
	
	static void reveseString(String str, int idx) {
	   if(idx == 0) {
		   System.out.println(str.charAt(idx));	
		   return;
	     }
	  
	   System.out.println(str.charAt(idx));
	   
	   reveseString(str, idx-1);	
	}
	
	
	public static void main(String[] args) {
		String str = "hsjsS";
		int idx = str.length()-1;
		
		 reveseString(str, idx);

	}
}


