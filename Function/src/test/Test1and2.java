package test;

import java.util.Scanner;

public class Test1and2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//문제1
		
		System.out.print("제곱값을 구할 숫자를 입력하세요: ");
		int square = scan.nextInt();
		System.out.println(square + "의 제곱은 " + getSquare(square) + "이다.");
		
		//문제2
		System.out.print("점수를 입력하세요: ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int fourth = scan.nextInt();
		System.out.println("평균은 : " + getAverage(first, second, third, fourth));
		
		//문제3
		System.out.print("숫자와 나눌 수를 입력하세요: ");
		int num = scan.nextInt();
		int divider = scan.nextInt();
		printQuotientRemainder(num, divider);
		
		//문제4
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		System.out.println(iseven(number));
		
	}
	
	public static int getSquare(int square)
	{
		return square * square;
	}

	public static double getAverage(int first, int second, int third, int fourth)
	{
		return (first + second + third + fourth) / 4.0;
	}
	
	public static void printQuotientRemainder(int num, int divider)
	{
		System.out.println("몫 : " + num / divider);
		System.out.println("나머지 : " + num % divider);
	}
	
	public static int iseven(int number)
	{
		return number % 2;
	}
}
