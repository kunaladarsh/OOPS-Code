package JavaCode;


class Base1{
	Base1(){
		System.out.println("i am a constructors");
	}
	
	Base1(int a){
		System.out.println("i am a overloading constructors: " + a);
	}	 
}

class Derived1 extends Base1{
	Derived1(){
		// super(90);
		System.out.println(" I am a derived class constructor");
	}
	
	Derived1(int a, int b){
		super(a);
		System.out.println(" I am a overloading constructor of Derived with value b as: " + b);	
	}
}

class childOfDerived extends Derived1{
	childOfDerived(){
		System.out.println("I am a chlidOfderived class of constructor");
	}
	
	childOfDerived(int a, int b, int c){
		super(a, b);
		System.out.println(" I am a overloading constructor of childOfDerived with value c as: " + c);
	}
	
}
 



public class Constructor_in_inheritance {

	public static void main(String[] args) {
        childOfDerived D = new childOfDerived(2, 4, 9);

	}
}
