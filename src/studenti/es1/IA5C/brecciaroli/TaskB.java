package studenti.es1.IA5C.brecciaroli;


public class TaskB implements Runnable {
	
	private int x,y;
	public TaskB(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void run() {
		int rand = y + (int)(Math.random() * ((x - y) + 1));
		
		try {
			Thread.sleep(rand*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Main.run = false;

		
	}

}
