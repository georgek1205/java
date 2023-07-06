package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		//문제1
		String gradeString = "My grade is A";
		System.out.println(gradeString.replace("A", "B"));
		
		//문제2
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
		//문제3
		String birthString = "19950721";
		int age = Integer.parseInt(birthString.substring(0, 4));
		System.out.println(age + "년생의 나이는 " + (2023 - age) + "살");
		
		//문제4
		Scanner scan = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String word = scan.nextLine();
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'e')
			{
				cnt++;
			}	
		}
		System.out.println("e의 개수는 " + cnt + 	"개 입니다");
		
		//문제5
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] arr = sentence.split(" ");
		System.out.println("단어 개수 : " + arr.length);
		
	}

}
