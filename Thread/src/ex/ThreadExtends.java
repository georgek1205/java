package ex;

public class ThreadExtends extends Thread{
		
		//출력할 기호
		private String symbol;
		
		public ThreadExtends(String symbol)
		{
			this.symbol = symbol;
		}
		
		@Override
		public void run()
		{
			//기호 열번 출력
			for(int i = 0; i < 10; i++)
			{
				System.out.println(symbol);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	
	
}
