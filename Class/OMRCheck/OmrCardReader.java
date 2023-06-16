package test.test02;

import java.util.Random;

public class OmrCardReader {

		private int[] ans = new int[5];
		private int score = 0;
		
		public OmrCardReader()
		{
			Random rand = new Random();
			for (int i = 0; i < ans.length; i++) 
			{
			    ans[i] = rand.nextInt(5) + 1;
			}
		}
		
		public void getScore(int[] arr)
		{
			for(int i = 0; i < ans.length; i++)
			{
				if(ans[i] == arr[i])
				{
					score += 20;
				}
			}
			System.out.println("Score : " + score);
		}
		
		
	
}
