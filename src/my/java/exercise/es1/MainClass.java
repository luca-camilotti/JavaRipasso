package my.java.exercise.es1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci T-min: ");
		int min=s.nextInt();
		System.out.println("Inserisci T-max: ");
		int max=s.nextInt();
		
		TaskA a = new TaskA();
		TaskB b = new TaskB(min*1000, max*1000, a);
		new Thread(a).start();
		new Thread(b).start();

	}

}
