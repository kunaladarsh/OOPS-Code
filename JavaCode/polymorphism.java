package JavaCode;

interface Mycamera{
	void takeSnap();
	void recordVideo();
	
	private void greet() {
		System.out.println("Good Morning");
	}
	
	default void record4kVideo() {
		greet();
		System.out.println("Recording in 4k...");
	}
}

interface myWifi{
	String[] getNetworks();
	void connectToNetwork(String Networks);
}


class MyCellPhones{
	void cellNumber(int phoneNumber) {
		System.out.println("Calling" + phoneNumber);
	}
	void pickCall() {
		System.out.println("connecting....");
	}}




class mySmartphone extends MyCellPhones implements myWifi, Mycamera{
	public void takesnap() {
		System.out.println("Takking snap");
	}
	public void recordVideo() {
		System.out.println("Taking Snap");
	}
	
	public String[] getNetworks() {
		System.out.println("Getting List of Network");
		String[] networklist = {"Harry", "Prashanth", "KKS"};
		return networklist;	
	}
	public void connectToNetwork(String network) {
		System.out.println("Connecting to" + network);
	}
	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}
}

public class polymorphism {

	public static void main(String[] args) {
		Mycamera cam1 = new mySmartphone(); // This is a smartphone but, use it as a camera 
		// obj.getNetworks(); ---> Not allowed
		cam1.recordVideo();
		cam1.record4kVideo();

		mySmartphone s = new mySmartphone();
		s.recordVideo();
		s.cellNumber(909902920);
		s.getNetworks();
	}

}
