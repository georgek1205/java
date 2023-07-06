package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//문제1
		int year = 2000;
		int month = 11;
		int day = 15;
		
		System.out.println(String.valueOf(year) + String.valueOf(month) + String.valueOf(day));
		
		
		//문제2
		String yearString = "1995";
		System.out.println(yearString + "년생의 나이는 " + (2023 - Integer.parseInt(yearString) + "살"));
		
		//문제3
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("제품명 : ");
		String choice = scan.next();
		int count = 0;
		for(int i = 0; i < goods.length; i++)
		{
			if(goods[i].equals(choice))
			{
				count++;
			}
		}
		System.out.println(count + "개");
		
		scan.close();
		
	}

}
