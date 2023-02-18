package Complete_DSA;

import java.util.ArrayList;
import java.util.*;

public class Arrays_2D_05 {
	
	static void reverseList(ArrayList<Integer> list) {
		int i=0;
		int j= list.size()-1;
		
		while(i < j) {
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {

		// wrapper classes 
		Integer i = Integer.valueOf(4);
		System.out.println(i);
		Float f = Float.valueOf(4.5f);
		System.out.println(f);
		
		
		
		/// Arraylist 
		ArrayList<Integer> l1 = new ArrayList<>();
		// ArrayList<Boolean> l1 = new ArrayList<>();	
		
		// add new element
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		
		// get an element at index
		System.out.println(l1.get(2));
		
		
		// print with for loop
		for(int i1=0; i1<l1.size(); i1++) {
			System.out.print(l1.get(i1)+ " ");	
		}
		
		
		// printing the array list directly
		System.out.println(" ");
		System.out.println(l1);
		
		
		// adding the element at some index i
		l1.add(1, 100);
		System.out.println(l1);
		
		
		// modifying element at index i
		l1.set(1,  141);
		System.out.println(l1);
		
		// removing an element at index i
		l1.remove(1); // index 1
		System.out.println(l1);
		
		// removing an element at index i
		l1.remove(Integer.valueOf(7));
		System.out.println(l1);
		
		// checking if an element exists
		boolean ans = l1.contains(Integer.valueOf(6));
		
		
		// if you don't specify class, you can put anything inside l
		ArrayList l = new ArrayList();
		l.add("pqes");
		l.add(5);
		l.add(true);
		System.out.println(l);
		
		
		// reverse the arraylist order using the methods
		reverseList(l1);
		System.out.println(l1);
		
		
		
		/// using the collections framework
		Collections.reverse(l1);
		System.out.println("Reverse List" + l1);
		
		Collections.sort(l1);
		System.out.println("Ascending order" + l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Desc order" + l1);

		
		
		
		
	}

}
