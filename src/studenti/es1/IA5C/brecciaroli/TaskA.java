package studenti.es1.IA5C.brecciaroli;


public class TaskA implements Runnable{
	private int n=0;

	@Override
	
	public void run() {
		while(Main.run) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			n++;
			System.out.println(n);
		}
		
	}

}
