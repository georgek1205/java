package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		//문제1
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		if(number < 10)
			System.out.println(number + "는 10보다 작습니다.");
		if(number > 10)
			System.out.println(number + "는 10보다 큽니다.");
		
		//문제2
		System.out.print("두 개의 수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a > b)
			System.out.println(">");
		if(a < b)
			System.out.println("<");
		if(a == b)
			System.out.println("==");
		
		//문제3
		System.out.print("성적을 입력하세요 : ");
		int grade = scan.nextInt();
		if(grade >= 70)
			System.out.println("합격 입니다");
		else
			System.out.println("불합격 입니다");
		
		//문제4
		System.out.print("수를 입력하세요 : ");
		int integer = scan.nextInt();
		if(integer % 2 == 0)
			System.out.println("짝수.");
		if(integer % 2 != 0)
			System.out.println("홀수.");
		
		scan.close();
	}

}
