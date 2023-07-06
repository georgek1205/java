package test;

public class Test01 {

	public static void main(String[] args) {

		//문제1
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
		
		//문제2
		for(int i = 2; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		System.out.println();
		
		//문제3
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//문제4
		for(int i = 5; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//문제5
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5 - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//문제6
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5 - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= (i * 2 - 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//5 = 1
		//4 = 3
		//3 = 5
	}

}
