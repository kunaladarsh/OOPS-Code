package JavaCode;

public class finally11 {
public static int greet() {
	try {
		int a = 90;
		int b = 0;
		int c = a/b;
		return c;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("This is the end of the function");
	}
	return 0;	
}

	public static void main(String[] args) {
		int k = greet();
		System.out.println(k);
	}
}
