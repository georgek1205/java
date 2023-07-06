package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String first = "Oh ";
		String second = "My ";
		String third = "God ";
		String combine = first + second + third;
		System.out.println(combine);
		
		//문제2
		System.out.print("ID를 입력 하세요 : ");
		String id = scan.next();
		System.out.println("Welcome! " + id);
		
		//문제3 한번의 입력을했지만 세 단어들이 사이즈3크기의 배열에 들어가게되는
		scan.nextLine();
		String[] combined = new String[3];
		
		for(int i = 0; i < 3; i++)
		{
			combined[i] = scan.next();
			System.out.println(combined[i]);
		}
		/*
		String input = "why so serious";
		String[] words = new String[3];
		int index = 0;
		for (String word : input.split(" ")) {
		    if (index >= 3) {
		        break;
		    }
		    words[index++] = word;
		}
		*/
	}

}
