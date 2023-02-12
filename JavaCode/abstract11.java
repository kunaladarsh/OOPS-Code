package JavaCode;

abstract class parent2{
	public parent2() {
		System.out.println("I am constructor of Base2");
	}
	
	public void sayhello(){
		System.out.println("Hello");
		
	}
	abstract public void greet();
	abstract public void greet2();

}

class child2 extends parent2{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	@Override
	public void greet2() {
		System.out.println("Good afternoon");
	}	
}

abstract class child3 extends parent2{
	public void th(){
		System.out.println("I am a good");
	}
}

public class abstract11 {
	public static void main(String[] args) {
     child2 obj = new child2();	
	 obj.sayhello(); 
	 obj.greet();
	}
}
