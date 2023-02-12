package JavaCode;


class A{

	public int a;
	public int harry() {
		return 4;
	}
	
	public void meth2() {
		System.out.println("I am method 2 of class A");
	}	
}

class B extends A{
	public void meth3(){
		System.out.println("i am method 3 of class B");
	}
}

public class overriding {

	public static void main(String[] args) {
		B s = new B();
		s.meth3();

	}
}
