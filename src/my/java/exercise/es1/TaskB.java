package my.java.exercise.es1;

public class TaskB implements Runnable {

	private TaskA task;
	private int min;
	private int max;
	
	public TaskB(int min, int max, TaskA t) {
		this.min=min;
		this.max=max;
		this.task=t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(new java.util.Random().nextInt(this.max-this.min) + this.min);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		task.stopMe();
		System.out.println("TaskA has been stopped!");

	}

}
