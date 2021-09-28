package studenti.es1.IA5C.brecciaroli;

import java.util.Scanner;

//Brecciaroli Marco 5CIA 24/09/2021

//per bloccare il trend si utilizza una variabile in comune che viene istanziata nel main
//entrambi i thread vengono gestiti in modo autonomo con due classi diverse, il secondo si sveglia dopo un tempo random
//e provvede a bloccare l'altro

public class Main {
	public static int x;
	public static int y;
	
	public static boolean run = true;
	
	
	public static boolean run() {
		return run;
	}
	
	static Scanner sc= new Scanner(System.in); 

	public static void main(String[] args) {
		
		do {
			System.out.println("Metti il numero grande");
			x = sc.nextInt(); 
			
		}while(x<0);
		
		do {
			y = sc.nextInt();
			
		}while(y<0);
		
		Thread t1 = new Thread(new TaskA());
		Thread t2 = new Thread(new TaskB(x,y));
		t1.start();
		t2.start();
	}

}
