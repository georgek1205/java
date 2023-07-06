package test;

import java.util.Random;
import java.util.Scanner;

public class Test02hwhard {

	public static void main(String[] args) {

		
		//문제1
		for(char alpha = 'A'; alpha <= 90; alpha++)
		{
			System.out.print(alpha + " ");
		}
		System.out.println("");
		
		//문제2
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력 하세요 : "); 
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= num && sum <= 100; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		//문제3
		System.out.print("세개의 수를 입력 하세요 : "); 
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		int j = 1;
		int i = 0;
		for(i = 1; j != n ;i += d)
		{
			j++;
		}
		System.out.println(i);
		
		//문제4
		System.out.print("수를 입력 하세요 : "); 
		int prime = scan.nextInt();
		int k = 0;
		for(k = 2; k < prime; k++)
		{
			if(prime % k == 0)
			{
				System.out.println("소수가 아닙니다");
				break;
			}
		}
		if(k == prime)
			System.out.println("소수 입니다");
		
		
		//문제5
		
		Random rand = new Random();
		int youWin = 0;
		int computerWin = 0;
		for(int z = 0; z < 5; z++) 
		{
		    int computerPlay = rand.nextInt(3) + 1;
		    System.out.print("가위(1) 바위(2) 보(3)!! : ");
		    int number = scan.nextInt();
		
			 System.out.print("computer : " + computerPlay + "-");
			 if(computerPlay == 1)
			 {	 
				 if(number == 1)
				 {
					 System.out.print("비겼습니다.");
				 }
				 else if(number == 2)
				 {
					 System.out.print("이겼습니다.");
					 youWin++;
				 }
				 else if(number == 3)
				 {
					 System.out.print("졌습니다.");
					 computerWin++;
				 }
			 }
			 else if(computerPlay == 2)
			 {
				 if(number == 1)
				 {
					 System.out.print("졌습니다.");
					 computerWin++;
				 }
				 else if(number == 2)
				 {
					 System.out.print("비겼습니다.");
				 }
				 else if(number == 3)
				 {
					 System.out.print("이겼습니다.");
					 youWin++;
				 }
			 }
			 else //보
			 {
				 if(number == 1)
				 {
					 System.out.print("이겼습니다.");
					 youWin++;
				 }
				 else if(number == 2)
				 {
					 System.out.print("졌습니다.");
					 computerWin++;
				 }
				 else if(number == 3)
				 {
					 System.out.print("비겼습니다.");
				 } 
			 }
			 System.out.println("");
		}
		if(youWin == computerWin)
		{
			System.out.println("최종결과 " + youWin + ":" + computerWin + " 로 비겼습니다.");
		}
		else
		{
			if(youWin > computerWin)
				System.out.println("최종 결과 " + youWin + ":" + computerWin + " 로 당신의 승리입니다.");
			else
				System.out.println("최종 결과 " + youWin + ":" + computerWin + " 로 당신의 패배입니다.");
		}
			
	}

}
