package JavaCode;
    public class Arrays{	
	public static void main(String[] args) {
		
		// there is a three ways to create an array in java
		
		/* 1. Declaration and memory allocations
		   int []marks = new int [5];
		*/
		
		/* 2. Declaration and then memory allocations
		    int [] marks;
	        marks = new int[5]; 
		marks[0] = 40;
		marks[1] = 80;
		marks[2] = 50;
		marks[3] = 59;
		marks[4] = 89;
		// marks[5] = 90; - throws an error
		*/ 
		   
		  
		// Declaration, memory allocations and initializations
		 int[]marks= {2,4,6,7,8};
		 float [] marks1 = {45.5f, 83.5f, 29.5f, 23.5f};
		 String [] student = {"adarsh", "singh", "kunal", "Raj"};
		/* 
		System.out.println(marks[4]);
		System.out.println(marks1[3]);
		System.out.println(student[2]);
		System.out.println(marks1.length);*/
		
		// quick quiz: Displays the Array (for loops)
		/*System.out.println("printing using the loop in order");
		for(int i=0; i<= marks.length; i++ ) {
			System.out.println(marks[i]);
		}*/
		
		// quick quiz: Displays the Array in reverse order (for loops)

		System.out.println("printing using the loop in reverse order");
	    for(int j= marks.length -1; j>=0; j--) {
	    	System.out.println(marks[j]);
	    }
		
		System.out.println(" ");
		// quick quiz: Displays the Array (for each loops)
		System.out.println("printing using the for-each loops");
	    for(String element:student) {
			System.out.println(element);
		}
	} 
} 


