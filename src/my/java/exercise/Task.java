package my.java.exercise;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Task done!");

	}

}
