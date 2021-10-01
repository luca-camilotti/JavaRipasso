package es2.campane.sandre;

//Davide Sandre 5BIA 28-09-2021

import java.util.concurrent.Semaphore;

public class ThreadC implements Runnable {

	private Semaphore semaphore; // = new Semaphore(0);
	private Semaphore SN; // = new Semaphore(0);

		
		public ThreadC(Semaphore S, Semaphore SP) {
			semaphore=S;
			SN=SP;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
				
				
				while(true) {
					try {
						semaphore.acquire();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					System.out.print("dan"+"\n");

					
						SN.release();
				}
					
			

		
		}

}
