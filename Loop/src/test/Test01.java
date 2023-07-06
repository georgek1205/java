package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		//문제1
		System.out.print("횟수를 입력하세요 : ");
		int num = scan.nextInt();
		int i = 0;
		while(i < num)
		{
			System.out.println("응 아니야");
			i++;
		}
			
		//문제2
		System.out.print("카운트 다운 입력하세요 :");
		int count = scan.nextInt();
		while (count > 0)
		{
			System.out.println(count--);
		}
		System.out.println(count + "\n발사");
		
		//문제3
		System.out.print("수를 입력하세요 : ");
		int big_num = scan.nextInt();
		int sum = 0;
		while(big_num  > 1)
		{
			if(big_num % 2 == 0)
				sum += big_num;
			big_num--;
		}
		System.out.println("더한 결과 : " + sum);
		
		
		//문제4
		int mult = 1;
		while(mult < 10)
		{
			System.out.println("2 X " + mult + " = " + 2 * mult++);
		}
		
		//문제5
		int tempo;
		int j = 0;
		while(j < 5)
		{
			System.out.print("입력 : ");
			tempo = scan.nextInt();
			System.out.println("출력 : " + tempo);
			j++;
		}
	}

}
