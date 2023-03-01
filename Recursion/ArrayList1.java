package DSA_Pratices;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList <String> list2 = new ArrayList<String>();
		
		// add element
		list.add(9);
		list.add(21);
		list.add(31);
		
		System.out.println(list);
		
		// get elements
		int element = list.get(1);
		System.out.println(element);
		
		// set element
		list.set(0, 89);
		System.out.println(list);
		
		// delete element
		list.remove(2);
		System.out.println(list);
		
		//Size
		int size = list.size();
		System.out.println(size);
		
		//sorting
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}

}
