
//Santarossa Riccardo 5BIA 24/09/2021

package studenti.es1.IA5B.santarossa;

import java.util.Scanner;

public class MainClass 
{

	public static boolean stop= true;
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		task j = new task();
		Thread t = new Thread(j);
		
		int tMin, tMax;
		
		System.out.println("Inserisci il tempo minimo: ");
		tMin= input.nextInt();
		System.out.println("Inserisci il tempo massimo: ");
		tMax= input.nextInt();
		
		task2 k = new task2(tMax,tMin);
		Thread t2= new Thread(k);
		
		t.start();
		t2.start();
		
	}

}
