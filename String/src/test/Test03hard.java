package test;

import java.util.Scanner;

public class Test03hard {

	public static void main(String[] args) {
		
		//문제1
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for(int i = 0; i < files.length; i++)
		{
			if(files[i].endsWith("jpg"))
			{
				count++;
			}
		}
		System.out.println("jpg 파일 개수 : " + count);
		
		
		//문제2
		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("1. 승리를 영어로 입력하세요 : ");
		String victory = scan.nextLine();
		
		System.out.print("2. 사랑을 영어로 입력 하세요 : ");
		String love = scan.nextLine();
		
		System.out.print("3. 컴퓨터를 영어로 입력 하세요 : ");
		String english = scan.nextLine();
		
		System.out.print("4. 노트북을 영어로 입력하세요 : ");
		String notebook = scan.nextLine();
		
		if(victory.equals("victory"))
		{
			score += 25;
		}
		if(love.equals("love"))
		{
			score += 25;
		}
		if(english.equals("english"))
		{
			score += 25;
		}
		if(notebook.equals("notebook"))
		{
			score += 25;
		}
		System.out.println("점수는 " + score + "점 입니다.");
		
		//문제3
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
		int same = 0;
		String[] names = membersString.split(":");
		for(int i = 0; i < names.length; i++)
		{
			for(int j = i + 1; j < names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					same++;
					break;
				}
			}
		}
		System.out.println("동명 이인 수 : " + same);
	}

}
