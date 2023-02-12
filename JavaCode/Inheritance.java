package JavaCode;

class Base{
	int x;	


public int getX() {
	return x;
	 
}

public void setX(int x) {
	System.out.println("i am base and setting x now");
	this.x = x;
}

public void println() {
	System.out.println("I am a constructor");
}
}

class Derived extends  Base{
	 int y;
	
	public int getY() {
		return y;

	}
	
	public void setY(int y) {
		System.out.println("i am base and setting y now");
		this.y = y*8;
		
		
	}
}




 
public class Inheritance {

	public static  void main(String[] args) {
		// create in object in base class
		Base b  = new Base();
		b.setX(9);
		System.out.println(b.getX());

		// create in object in Derived class
		Derived d  = new Derived();
		d.setY(9);
		System.out.println(d.getY());

	}

}
