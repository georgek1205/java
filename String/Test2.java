package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//Q1
		int year = 2000;
		int month = 11;
		int day = 15;
		
		System.out.println(String.valueOf(year) + String.valueOf(month) + String.valueOf(day));
		
		
		//Q2
		String yearString = "1995";
		System.out.println("Person born in" + yearString + " is has age of" + (2023 - Integer.parseInt(yearString)));
		
		//Q3
		String[] goods = {"Sprite", "Ramen", "Shin-ramen", "CocaCola", "Ramen", "Ramen", "Sprite", "Shin-ramen"};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Product Name : ");
		String choice = scan.next();
		int count = 0;
		for(int i = 0; i < goods.length; i++)
		{
			if(goods[i].equals(choice))
			{
				count++;
			}
		}
		System.out.println(count + "products");
		
		scan.close();
		
	}

}
