package test.test03;

import java.util.Random;

public class Lotto {

	private int[] hand_num = new int[6];
	
	
	public Lotto(String hand)
	{
		String[] temp = hand.split(" ");
		for(int i = 0; i < hand_num.length; i++)
		{
			hand_num[i] = Integer.parseInt(temp[i]);
		}
	}
		
	public Lotto()
	{
		int i, j;
		Random rand = new Random();
		for (i = 0; i < hand_num.length; i++) 
		{
			hand_num[i] = rand.nextInt(45) + 1;
			j = 0;
			while(j < i)
			{
				if(hand_num[j] != hand_num[i])
				{
					j++;
				}
				else
				{
					hand_num[i] = rand.nextInt(45) + 1;
					j = 0;
				}
			}
			
		}
	}
	
	public int[] getHand()
	{
		return hand_num;
	}
	
}

