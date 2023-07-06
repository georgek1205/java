package ex;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int[] scores = {90, 85, 100, 95, 80}; // 선언후 초기화
		int[] numbers = new int[10]; //사이즈만 할당
		
		//세번째 값 출력
		System.out.println(scores[2]);
		
		System.out.println(scores[0]);
		System.out.println(scores[3]);
		
		int number = 1;
		System.out.println(scores[number]);
		
		scores[3] = 94;
		
		System.out.println();
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		System.out.println(sum);
		System.out.println();
		
		
	}

}