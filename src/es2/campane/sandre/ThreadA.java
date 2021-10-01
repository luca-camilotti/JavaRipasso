package es2.campane.sandre;

//Davide Sandre 5BIA 28-09-2021

import java.util.concurrent.Semaphore;

public class ThreadA implements Runnable {

	private Semaphore semaphore = new Semaphore(0);
	private Semaphore SN = new Semaphore(0);

		
		public ThreadA(Semaphore S, Semaphore SP) {
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
						System.out.print("din"+"\n");
					
						SN.release();
				}
			
		}

}
