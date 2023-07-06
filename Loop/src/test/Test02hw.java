package test;

import java.util.Scanner;

public class Test02hw {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//문제1
		System.out.print("수를 입력 하세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num; i++)
		{
			sum+=i;
		}
		System.out.println("합 : " + sum);
		
		
		//문제2
		int aggregate = 0;
		double gpa = 0;
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " 번째 수를 입력 하세요 : ");
			int num_forsum = scan.nextInt();
			aggregate += num_forsum;
		}
		gpa = aggregate / 5.0;
		System.out.println("총합 : " + aggregate +  " 평균 : " + gpa);
		
		//문제3
		System.out.print("수를 입력 하세요 : ");
		int factorial = scan.nextInt();
		int result = 1;
		if(factorial <= 8 && factorial > 0)
		{
			for(int i = 1; i <= factorial; i++)
			{
				result *= i;
			}
			System.out.println(factorial + "! = " + result);
		}
		else
		{
			System.out.println("수는 8이 최대입니다");
		}
		
		//문제4
		System.out.print("1번째수를 입력하세요 : ");
		int min_scan_num = scan.nextInt();
		for(int i = 2; i <= 5; i++)
		{
			System.out.println(i + "번째 수를 입력 하세요 :");
			int scan_num = scan.nextInt();
			min_scan_num = scan_num;
			if(min_scan_num > scan_num)
			{
				min_scan_num = scan_num;
			}
		}
		System.out.println("최소값은 " + min_scan_num + "입니다");
		
		//문제5
		System.out.print("수를 입력 하세요 : ");
		int divider = scan.nextInt();
		for(int i = 1; i <= divider; i++)
		{
			if(divider % i == 0)
				System.out.print(i + " ");
		}
	}

}
