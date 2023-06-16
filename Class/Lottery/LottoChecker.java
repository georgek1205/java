package test.test03;

import java.util.Random;

public class LottoChecker {
	
	private int[] auto_ans = new int[6];
	
	public LottoChecker()
	{
		int i, j = 0;
		Random rand = new Random();
		for (i = 0; i < auto_ans.length; i++) 
		{
			auto_ans[i] = rand.nextInt(46) + 1;
			
			while(j < i)
			{
				if(auto_ans[j] != auto_ans[i])
				{
					j++;
				}
				else
				{
					auto_ans[i] = rand.nextInt(45) + 1;
					j = 0;
				}
			}
			
		}
	}
	
	public void printChecker()
	{
		System.out.print("당첨번호 : ");
		for(int i = 0; i < auto_ans.length; i++)
		{
			System.out.print(auto_ans[i] + " ");
		}
		System.out.println();
	}
	
	public void handChecker(int[] hand)
	{
		int count = 0;
		for(int i = 0; i < auto_ans.length; i++)
		{
			for(int j = 0; j < hand.length; j++)
			{
				if(auto_ans[i] == hand[j])
				{
					count++;
					break;
				}
			}
			System.out.print(hand[i] + " ");
		}
		switch(count)
		{
			case 6:
				System.out.println("1등");
				break;
			case 5:
				System.out.println("2등");
				break;
			case 4:
				System.out.println("3등");
				break;
			case 3:
				System.out.println("4등");
				break;
			case 2:
				System.out.println("5등");
				break;
			default:
				System.out.println("꽝!");
			
				
		}
	}
	
}
