package JavaCode;

class Ekclass{
	int a;
	
	int getset() {
		return a;
		
	}
	
	
	Ekclass(int v){
		this.a = v;
	}
	
	

	public int returnone() {
		return 1;
		
	}
}


public class thisKey_superKey {

	public static void main(String[] args) {
     Ekclass e = new Ekclass(5);
     System.out.println(e.getset());

	
	}

}
