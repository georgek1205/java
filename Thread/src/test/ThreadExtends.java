package test;

public class ThreadExtends implements Runnable{
	public String sound;
	public ThreadExtends(String sound)
	{
		this.sound = sound;
	}
	
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(sound);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
