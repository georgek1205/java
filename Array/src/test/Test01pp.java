package test;

import java.util.Scanner;

public class Test01pp {

	public static void main(String[] args) {

		//문제1
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 index와 값을 입력하세요 : ");
		int idx = scan.nextInt();
		int value = scan.nextInt();
		numbers[idx] = value;
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		//문제2
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		int result = 0;
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] == 'O')
			{
				result += 10;
			}
		}
		System.out.println("채점 결과는" + result + "입니다. ");
		System.out.println();
		//문제3
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int salary = 0;
		for(int i = 0; i < works.length; i++)
		{
			if(i < 5)
			{
				salary += 8500 * works[i];
			}
			else 
			{
				salary += 9500 * works[i];
			}
		}
		System.out.println("일주일간 총 임금은 " + salary + "원 입니다.");
		System.out.println();
		//문제4
		char[] alpha = new char[26];
		int idx_alpha = 0;
		for(char i = 'A'; i <= 'Z'; i++)
		{
			alpha[idx_alpha] = i;
			System.out.print(alpha[idx_alpha++] +  " ");
		}
		System.out.println();
		for(int i = 0; i < alpha.length; i++)
		{
			if(alpha[i] == 'V')
			{
				System.out.println("V 는 " + (i + 1) + "번째 입니다");
				break;
			}
		}
		System.out.println();
		//문제5
		int[] arr = new int[5];
		int count = 0;
		while(true)
		{
			if(count < 5)
			{
				System.out.println("수를 입력하세요 : ");
				int input = scan.nextInt();
				if(input % 2 == 0)
				{
					arr[count++] = input;
				}
			}
			else
			{
				break;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		scan.close();
	}

	
		
		
}
