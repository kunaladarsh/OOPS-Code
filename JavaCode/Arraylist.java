package JavaCode;
import java.util.*; 

public class Arraylist {
	

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(9);
		l1.add(8);
		l1.add(9);
		l1.add(3);
		l1.add(9);
		
		int sum=0;
		for(int i=0; i<l1.size(); i++) {
			System.out.print(l1.get(i));
			if(i == l1.size()-1) {
			System.out.print(" ");
			}
			else{
				System.out.print(", ");
				
		    }
		
			sum = sum + l1.get(i);	
		}
		System.out.println("");
		System.out.println("Sum of all array elements: " + sum);
		//System.out.println(l1.contains(8));
}}

