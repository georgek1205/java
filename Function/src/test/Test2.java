package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//문제1
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(summ(num));
		
		//문제2
		System.out.print("수를 입력하세요 : ");
		int prime_num = scan.nextInt();
		if(prime_num >= 2)
		{
			System.out.println(isprime(prime_num));
		}
		else
		{
			System.out.println("숫자는 2이상이여야합니");
		}
		
	}

	public static int summ(int num)
	{
		int sum = 0;
		for(int i = 1; i <= num  && sum <= 100; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	public static boolean isprime(int prime_num)
	{
		for(int i = 2; i < prime_num; i++)
		{
			if(prime_num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
}
