package JavaCode;

abstract class pen{
	abstract void write();
		
	
	abstract void refill();
}

class Fountainpen extends pen{
	void write() {
		System.out.println("smooth write to use");
	}
	void refill() {
		System.out.println("refilling is so easy");
	}
	void  changeNib() {
		System.out.println("okk its changeing");
	}
}


class monkey{
	void jump() {
		System.out.println("jumping...");
	}
		
	void bite(){
		System.out.println("Biteing...");
		
	}	
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class Human extends monkey implements BasicAnimal{
	void speak() {
		System.out.println("hello sir...How are you");
	}
	
	public void eat() {
		System.out.println("eating a apple");
	}
	public void sleep() {
		System.out.println("you are sleeping a 5hrs");
	}
}


public class praticesSet11 {

	public static void main(String[] args) {
		pen p = new Fountainpen();
		p.write();
		p.refill();
		// p.changeNib();
		
		
		
		Human h = new Human();
		h.sleep();
		h.jump();
		
		
		//Q.5
		monkey m = new Human();
		m.jump();
		m.bite();
	//	m.speak(); --> can't not use method because the reference is monkey which does not have speak method
		
		

	}

}
