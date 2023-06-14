package test;

import java.util.Scanner;

public class Test03hard {

	public static void main(String[] args) {
		
		//Q1
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for(int i = 0; i < files.length; i++)
		{
			if(files[i].endsWith("jpg"))
			{
				count++;
			}
		}
		System.out.println("Number of jpg file : " + count);
		
		
		//Q2
		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("1. Write victory in english : ");
		String victory = scan.nextLine();
		
		System.out.print("2. Write love in english : ");
		String love = scan.nextLine();
		
		System.out.print("3. Write computer in english : ");
		String english = scan.nextLine();
		
		System.out.print("4. Write notebook in english : ");
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
		System.out.println("Score : " + score);
		
		//Q3
		String membersString = "Amy:George:Edward:Aslan:George:Emily:Emily:Louis:Andy:Louis";
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
		System.out.println("Number of people with the same name : " + same);
	}

}
