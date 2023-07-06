package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<>(Arrays.asList("hagulu", "happy", "google", "bts", "iu", "cuteboy"));
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		String name = scan.nextLine();
		if(arr.contains(name))
		{
			System.out.println("중복 입니다.");
		}
		else
		{
			System.out.println("사용가능한 아이디입니다");
		}
		
		//문제2
		List<Integer> arr2 = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		int max = arr2.get(0);
		int min = arr2.get(1);
		for(int i = 0; i < arr2.size(); i++)
		{
			if(arr2.get(i) > max)
			{
				max = arr2.get(i);
			}
			
			if(arr2.get(i) < max)
			{
				min = arr2.get(i);
			}
		}
		double total = 0;
		for(int i = 0; i < arr2.size(); i++)
		{
			if(arr2.get(i) != max & arr2.get(i) != min)
			{
				total += arr2.get(i);
			}
		}
		double average = total / (arr2.size() - 2);
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);
		
		
		//문제3
//		Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
//		저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
		Random rand = new Random();
		List<Integer> lotto = new ArrayList<>();
		for(int i = 0 ; i < 6; i++)
		{
			lotto.add(rand.nextInt(45) + 1);
			
//			int testing = rand.nextInt(45) + 1;
//			if(lotto.contains(testing))
//			{
//				i--;
//			}
//			else
//			{
//				lotto.add(testing);
//			}
//			이렇게하면 밑에 중복체크하는복잡한방법쓸필요가없
			int j = 0;
			while(j < i)
			{
				if(lotto.get(j) == lotto.get(i))
				{
					lotto.set(i, rand.nextInt(45) + 1);
					j = 0;
				}
				else
				{
					j++;
				}
			}
		}
		lotto.sort(null);
		System.out.println(lotto);
		
		//문제4
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> addnames = new ArrayList<>(Arrays.asList("프랑키", "루피", "쵸파", "로빈", "루피"));
		int[] count = new int[5];
		int check = names.size();
		for(int i = 0; i < addnames.size(); i++)
		{
			for(int j = 0; j < check; j++)
			{
				if((names.get(j)).equals((addnames.get(i))))
				{
					count[j]++;
					names.add(addnames.get(i) + count[j]);
					break;
				}
				if(j == check - 1)
				{
					names.add(addnames.get(i));
					
				}
			}
			
		}
		System.out.println(names);
		
	}

}
