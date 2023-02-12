package JavaCode;

public class trycatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception e) {
		System.out.print("we gtting some error ");
		System.out.println(e);
		}
		
		System.out.println("cong. you got its.");
		

	}

}
