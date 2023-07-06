package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//문제1
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int integer = scan.nextInt();
		if(integer < 0)
			System.out.println("음수입니다.");
		else
			System.out.println("양수입니다.");
		
		
		//문제2
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
		
		
		
	}

}
