package multithreading;

public class MyChildThread extends Thread{
	@Override
	public void run() {
		
		System.out.println("In side run() Thread is alive or not?" +this.isAlive());
		int num = 0;
		while(num<4) {
			num++;
			System.out.println("number=" +num);
			try {
				sleep(500);
			}catch(InterruptedException exp) {
				
				System.err.println("Thread Interrupted.......");
			}
		}
	}

}
