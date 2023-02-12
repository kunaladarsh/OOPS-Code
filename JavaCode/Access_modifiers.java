package JavaCode;
class c1{
	public int x = 5;
	protected int y = 51;
	int z = 6;
	private int p = 78;
	public void meth1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);	
	}
}



public class Access_modifiers {
	public static void main(String[] args) {
		c1 obj = new c1();
		
		// modifier as a class
		// obj.meth1();
		
		
		
		// modifier as a package 
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		// System.out.println(obj.p);
		

	}

}
