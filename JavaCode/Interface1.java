package JavaCode;

interface Bicycle{
	int a = 90;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

class AvonCycle implements Bicycle{
	void blowHorn() {
		System.out.println("Pee pee poo poo");
	}
	public void speedUp(int increment) {
		System.out.println("applying SpeedUP: " + increment);	
	}
	public void applyBrake(int decrement) {
		System.out.println("Applying Breake: " + decrement);	
	}
}  

 
public class Interface1 {
	public static void main(String[] args) {
		AvonCycle cycleHarry = new AvonCycle();
		cycleHarry.blowHorn();
		cycleHarry.applyBrake(cycleHarry.a);
		
	
		cycleHarry.speedUp(+100);
		
				
	}
	

}
