package JavaCode;

class MyNewThread extends Thread{
	public void run(){
		while(true) {
		
     		System.out.println("Thank you.");
	}}
}

class MyNewThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thank you1 ");
	}
}
}
public class Thread11 {
	public static void main(String[] args) {
		MyNewThread t1 = new MyNewThread();
		MyNewThread2 t2 = new MyNewThread2();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
	}

 }
