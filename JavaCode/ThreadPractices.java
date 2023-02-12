package JavaCode;

class quesThread extends Thread{
	public void run() {
		while(true) {
		System.out.println("Good Morning...");
		
	}
  }	
}

class quesThread1 extends Thread{
	public void run() {
		while(true) {
		    try {
				Thread.sleep(200);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Welcome....");
		}
	}
}


public class ThreadPractices {
    public static void main(String[] args) {
    quesThread t1 = new quesThread();
    t1.start();
    
    quesThread1 t2 = new quesThread1();
    t2.start();
    
        

    }
}