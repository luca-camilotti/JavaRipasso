
//Santarossa Riccardo 5BIA 24/09/2021

package studenti.es1.IA5B.santarossa;

public class task2 implements Runnable 
{
	int tempoMax, tempoMin;
	
	
	public task2(int tMax, int tMin)
	{
		this.tempoMax=tMax;
		this.tempoMin=tMin;
	}
	

	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(tempoMin + (int) (Math.random()*tempoMax));
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	   MainClass.stop = false;

	}

}
