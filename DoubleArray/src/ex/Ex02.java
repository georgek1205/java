package ex;

public class Ex02 {

	public static void main(String[] args) {

		int[][] numbers = new int[5][6];
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				if(j == 2)
				{
					numbers[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
