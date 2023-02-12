package JavaCode;

class myThreadRunnable implements Runnable{
	public void run() {
		int i = 0;
		while(i<=50) {
		System.out.println("I am a thread 1 not a thread");
		i++;
	}	}
}

class myThreadRunnable2 implements Runnable{
	public void run() {
		int i=0;
		while(i<=100) {
		System.out.println("I am a thread 2 not a thread");
		i++;
	}
}}

public class RunnableThread {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		myThreadRunnable bullet1 = new myThreadRunnable();
		Thread gun1 = new Thread();
		
		myThreadRunnable2 bullet2 = new myThreadRunnable2();
		Thread gun2 = new Thread();
		
		gun1.start();
		gun2.start();
		
		
	}
}
