package JavaCode;
class Mythread1 extends Thread{
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Thank you: ");
			try {
				Thread.sleep(455);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			i++;
		}
	}
}

class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
        }
    }
}

public class ThreadMethod {

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.run();
        t2.run();
	}
}
