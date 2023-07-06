package test;

import java.util.Scanner;

public class Testhwhard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수1 : ");
		int first_score = scan.nextInt();
		System.out.print("점수2 : ");
		int second_score = scan.nextInt();
		double average = (first_score + second_score) / 2.0;
		if(first_score < 50 || second_score < 50)
			System.out.println("과락");
		else
		{
			if(average >= 60)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}
		
		//윤년
		System.out.print("연도 : ");
		int year = scan.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println("윤년");
		else
			System.out.println("평년");
		
		
		//가위바위보
		System.out.print("영희 공격 : ");
		int yh = scan.nextInt();
		System.out.print("철수 공격 : ");
		int cs = scan.nextInt();
		if(yh == 1)
		{
			if(cs == 1)
				System.out.println("비겼다");
			else if(cs == 2)
				System.out.println("철수가 이겼다");
			else if(cs == 3)
				System.out.println("영희가 이겼다");
		}
		else if(yh == 2)
		{
			if(cs == 1)
				System.out.println("영희가 이겼다");
			else if(cs == 2)
				System.out.println("비겼다");
			else if(cs == 3)
				System.out.println("철수가 이겼다");
		}
		else if(yh == 3)
		{
			if(cs == 1)
				System.out.println("철수가 이겼다");
			else if(cs == 2)
				System.out.println("영희가 이겼다");
			else if(cs == 3)
				System.out.println("비겼다");
		}
		//45분전
		System.out.print("시간 분 입력 : ");
		int hour = scan.nextInt();
		int min = scan.nextInt();
		min -= 45;
		if(min < 0)
		{
			hour--;
			min+=60;
		}
		if(hour < 0)
			hour += 24;
		System.out.println(hour + "시 " + min + "분");
		
		//윳놀이
		System.out.print("윷 상태를 입력하세요 : ");
		int first_hand = scan.nextInt();
		int second_hand = scan.nextInt();
		int third_hand = scan.nextInt();
		int fourth_hand = scan.nextInt();
		int total = first_hand + second_hand + third_hand + fourth_hand;
		switch(total)
		{
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윳");
			break;
		case 0:
			System.out.println("모");
		}
		
		scan.close();
	}

}
