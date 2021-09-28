package my.java.exercise.es2;

import java.util.concurrent.Semaphore;

public class Task implements Runnable {

	private Semaphore mutex;
	
	public Task(Semaphore mutex) {
		this.mutex = mutex;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				mutex.acquire();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// inizio sezione critica
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			System.out.println("Task "+Thread.currentThread().getName());
			// fine sezione critica
			mutex.release();
			
		}
	}

}
