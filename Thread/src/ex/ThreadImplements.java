package ex;

public class ThreadImplements implements Runnable{

	private String symbol;
	public ThreadImplements(String symbol)
	{
		this.symbol = symbol;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++)
		{
			System.out.println(symbol);
			
			try 
			{
				Thread.sleep(800);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

		
	
	
}
