package ex;

import java.util.Scanner;

public class Ex02pp2 {

	public static void main(String[] args) {

		
		//문제1
		int iter = 1;
		while(true)
		{
			System.out.println("Hello World");
			iter++;
			if(iter > 8)
				break;
		}
		
		//문제2
		for(int i = 1 ; i <= 10; i++)
		{
			if(i % 2 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//문제3
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int div = scan.nextInt();
		for(int i = 1; i <= 100; i++)
		{
			if(i % div == 0)
				System.out.print(i + " ");
		}
		System.out.println("");
		
		//문제4
		while(true)
		{
			System.out.print("수를 입력하세요 : ");
			int input = scan.nextInt();
			if(input == 0)
			{
				System.out.println("끝");
				break;
			}
		}
	}

}
