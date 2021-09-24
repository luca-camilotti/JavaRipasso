package my.java.exercise;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Git!");
		
		// The Traditional Long Way:
		Task j = new Task();
		Thread t = new Thread(j);
		t.start();
		
		// Oggetti anonimi:
		new Thread(new Task()).start();

	}

}
