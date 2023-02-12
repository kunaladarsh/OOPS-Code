package JavaCode;

public class method_overloading {
	
	static void telljoke() {
		System.out.println("I invented a new world!\n" +
	                           "Plagiarism");
		
	}
	
	static void change(int a) {
		a = 98;  
	}
	
	static void change(int []arr) {
		arr[0] = 100;
	}

	public static void main(String[] args) {
		
		// telljoke();
		
		
		
		// case : 1
		
		int x = 49;
		
		change(x); 
		System.out.println("The value of after running change is :" + x);
	    
		// case :: 2
		
		int [] marks = {43, 54, 73, 39, 92, 90};
		change(marks);
		
		System.out.println("The marks  of after running change is:::: " + marks[0]);
		
        
  }


	}
