package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		System.out.print("1~7 사이의 날짜를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("수요일");
			break;
		case 2:
			System.out.println("목요일");
			break;
		case 3:
			System.out.println("금요일");
			break;
		case 4:
			System.out.println("토요일");
			break;
		case 5:
			System.out.println("일요일");
			break;
		case 6:
			System.out.println("월요일");
			break;
		case 7:
			System.out.println("화요일");
			break;
			
		}
		
		
		
		
	}

}
