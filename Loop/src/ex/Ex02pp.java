package ex;

import java.util.Scanner;

public class Ex02pp {

	public static void main(String[] args) {

		//문제1
		for(int i = 35; i <= 40; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//문제2
		for(int i = 5; i >= -5; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//문제3
		for(int i = 1; i <= 50; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		//문제4
		int count = 0;
		for(int i = 1; i < 100; i++)
		{
			if(i%7 == 0)
			{
				count++;
			}
		}
		System.out.println("7의 배수의 갯수는 : " + count);
		
		//문제5
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int num = scan.nextInt();
		for(int i = 1; i <= 9 ;i++)
		{
			System.out.println(num + " X " + i + " = " + num * i);
		}
		//문제6
		int num_1 = 0, max_num = 0;
		for(int i = 0; i < 5; i++)
		{
			System.out.print("수를 입력하세요 : ");
			num_1 = scan.nextInt();
			if(num_1 > max_num)
			{
				max_num = num_1;
			}
		}
		
		
		
		System.out.println("가장 큰 수 : " + max_num);
		
	}

}
