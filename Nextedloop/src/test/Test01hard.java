package test;

import java.util.Scanner;

public class Test01hard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//문제1
		System.out.print("단수 범위를 입력하세요 : ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		for(int i = first; i <= second; i++)
		{
			for(int j = 1; j < 9; j++)
			{
				System.out.println(i + " X " + j + " = " + i*j);
			}

		}
		//문제2
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int repeat = scan.nextInt(); 
		for(int i = 1; i <= repeat; i++)
		{
			for(int j = repeat - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= (i * 2 - 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//문제3
		System.out.print("모래시계 크기를 입력하세요 : ");
		int sandglass = scan.nextInt();
		for(int i = 0; i < sandglass; i++)
		{
			for(int j = 0; j < sandglass; j++)
			{
				if(i == 0 || i == (sandglass - 1))
				{
					if(i % 2 == 0)
					{
						if(j % 2 == 0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print("+");
						}
					}
					else
					{
						if(j % 2 == 0)
						{
							System.out.print("+");
						}
						else
						{
							System.out.print("*");
						}
					}
				}
				
					
			}
			System.out.println();
		}
		
	}

}
