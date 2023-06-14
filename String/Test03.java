package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		//Q1
		String gradeString = "My grade is A";
		System.out.println(gradeString.replace("A", "B"));
		
		//Q2
		String phoneNumber = "01012345678";
		int cnt = 0;
		for(int i = 0; i < phoneNumber.length(); i++)
		{
			System.out.print(phoneNumber.charAt(i));
			if(i == 2 || i == 6)
			{
				System.out.print('-');
			}
		}
		System.out.println();
		//Q3
		String birthString = "19950721";
		int age = Integer.parseInt(birthString.substring(0, 4));
		System.out.println(age + " borned person has an age of " + (2023 - age));
		
		//Q4
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input word : ");
		String word = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'e')
			{
				cnt++;
			}	
		}
		System.out.println("Number of character 'e' : " + cnt);
		
		//Q5
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] arr = sentence.split(" ");
		System.out.println("Number of words : " + arr.length);
		
	}

}
