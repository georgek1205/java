package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		
		//문제1
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 90);
		map.put("수학", 85);
		map.put("영어", 90);
		map.put("사회", 80);
		map.put("과학", 100);
		
		System.out.println(map);
		
		//문제2
		if(map.containsKey("사회"))
		{
			map.put("사회", map.get("사회") + 5);
			System.out.println(map);
		}
		System.out.println(map);
		
		//문제3
		Scanner scan = new Scanner(System.in);
		System.out.print("조회 할 과목명을 입력하세요 : ");
		String input = scan.nextLine();
		if(map.containsKey(input))
		{
			System.out.println(map.get(input));
		}
		else
		{
			System.out.println("자료 없음");
		}
		
		//문제4
		Set<String> key = map.keySet();
		
		for(String course : key)
		{
			if(map.get(course) >= 90)
			{
				System.out.print(course + " ");
			}
		}
			
		System.out.println();
		//문제5
		for(String course : key)
		{
			if(map.get(course) >= 100)
			{
				System.out.println("수상가능");
			}
		}
		
		Iterator<String> iter = key.iterator();
		while(iter.hasNext())
		{
			if(map.get(iter.next()) == 100)
			{
				System.out.println("수상가능");
				break;
			}
		}
		
		
//		Iterator<String> iter = map.iterator();
//		list, set 만 iterator 가능.
		
		
		//강조 : 결국 이런것들은 다 key를 기준으로 value를 접근하는거다.
	}
	

}
