package my.java.exercise.es1;

public class TaskA implements Runnable {

	private int count;
	private boolean isRunning;
	
	public TaskA() {
		this.count=0;
		this.isRunning=true;
	}
	
	public void stopMe() {
		this.isRunning=false;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(this.isRunning) {
			System.out.println("TaskA: "+this.count);
			this.count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
