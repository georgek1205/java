package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Q1
		String first = "Oh ";
		String second = "My ";
		String third = "God ";
		String combine = first + second + third;
		System.out.println(combine);
		
		//Q2
		System.out.print("Please input ID : ");
		String id = scan.next();
		System.out.println("Welcome! " + id);
		
   		 //Q3
		scan.nextLine();
		String[] combined = new String[3];
		
		for(int i = 0; i < 3; i++)
		{
			combined[i] = scan.next();
			System.out.println(combined[i]);
		}
		
	}

}
