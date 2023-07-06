package test;


import java.util.Scanner;

public class Testhw {

	public static void main(String[] args) {

		//문제1
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 수를 입력하세요 : ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		
		if(first % 2 == 0)
			System.out.println(first + "는 짝수입니다.");
		if(second % 2 == 0)
			System.out.println(second + "는 짝수입니다.");
		if(third % 2 == 0)
			System.out.println(third + "는 짝수입니다.");
		
		//문제2
		System.out.print("BMI 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		if(bmi <= 10)
			System.out.println("정상");
		else if(bmi <= 20)
			System.out.println("과체중");
		else
			System.out.println("비만");

		//문제3
		System.out.print("두 점수를 입력하세요 : ");
		int first_score = scan.nextInt();
		int second_score = scan.nextInt();
		double average = (first_score + second_score) / 2.0;
		if(average >= 70)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		
		//문제4
		System.out.print("세 수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a > b)
		{
			if(a > c)
				System.out.println(a);
			else if(b > c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		else
		{
			if(b > c)
				System.out.println(b);
			else if(a > c)
				System.out.println(a);
			else
				System.out.println(c);
		}	
		
		//문제5
		System.out.print("월을 입력 하세요 : ");
		int month = scan.nextInt();
		switch(month)
		{
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		case 12, 1, 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력하셧습니다.");
		}
		
		
	}

}
