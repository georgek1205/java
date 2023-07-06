package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//문자열 변수 선언및 초기화
		String text1 = "Hello World";
		System.out.println(text1);
		
		int number = 10;
		System.out.println(text1 + " " + number);
		
		
		String text2 = "!!!";
		String newText = text1 + text2;
		System.out.println(newText);
		
		//문자열1
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		
		String input1 = scan.next();
		String input2 = scan.next();
		
		
		System.out.println(input1);
		System.out.println(input1 + input2);
		
		scan.nextLine(); //앤터키기준으로 가장 마지막(\n) 까지 가져온다; 버퍼 클리
		
		System.out.print("문자열을 입력하세요 : ");
		String lineInput = scan.nextLine();
		System.out.println(lineInput);
		
		//문자열 배열
		String[] texts = {"apple", "bear", "car"};
		for(int i = 0; i < texts.length; i++)
		{
			System.out.println(texts[i]);
		}
		
	}

}
