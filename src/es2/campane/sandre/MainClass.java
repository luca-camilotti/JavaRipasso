package es2.campane.sandre;

// Davide Sandre 5BIA 28-09-2021

import java.util.concurrent.Semaphore;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Semaphore mutex = new Semaphore(1);
			Semaphore mutexB = new Semaphore(0);
			Semaphore mutexC = new Semaphore(0);


			ThreadA x = new ThreadA(mutex, mutexB);
			Thread A = new Thread(x);
			
			ThreadB y = new ThreadB(mutexB, mutexC);
			Thread B = new Thread(y);
			
			ThreadC z = new ThreadC(mutexC, mutex);
			Thread C = new Thread(z);
			
			A.start();
			B.start();
			C.start();
			
			
	}

}
