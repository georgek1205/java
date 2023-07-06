package ex;

public class Ex02 {

	public static void main(String[] args) {

		//횟수 반복
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Hello World!!!");
		}
		
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		for(int i = 5; i > 0; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
		
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		
		int weight = 75;
		for(; weight >= 70; weight -=2)
		{
			System.out.println("으쌰으쌰");
		}
		
		int i = 0;
		while(true)
		{
			if(i == 8)
				break;
			
			System.out.println("Hello World");
			i++;
		}
		
		for (i = 0; i < 10; i++)
		{
			if(i % 4 == 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
