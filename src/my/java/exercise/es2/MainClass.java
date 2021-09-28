package my.java.exercise.es2;

import java.util.concurrent.Semaphore;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Git!");
		
		// mutex
		Semaphore mutex = new Semaphore(1);
		
		// The Traditional Long Way:
		Task j = new Task(mutex);
		Thread t = new Thread(j);
		t.start();
		
		// Oggetti anonimi:
		new Thread(new Task(mutex)).start();

	}

}
