package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Map<String, String> idMap = new HashMap<>();
		
		idMap.put("seunggyu", "승규");
		idMap.put("yu", "유재석");
		idMap.put("bada", "바다");
		idMap.put("ohndar", "김민기");
		
		System.out.println(idMap);
		System.out.println(idMap.get("yu"));
		System.out.println(idMap.get("seunggyu"));
		
		
		//값 수정
		idMap.put("ohndar", "박명수");
		System.out.println(idMap);
		
		//특정키가 존재하는지 확인
		if(idMap.containsKey("seunggyu"))
		{
			System.out.println("seunggyu 키가 있다");
		}
		else
		{
			System.out.println("seunggyu 키가 없다");
		}
		
		//반복문. 맵은 반복문을 사용하는경우는 흔치않다.
		//모든 키 리턴
		Set<String> idSet = idMap.keySet();
		
		//
		System.out.println(idSet);
		
		for(String id:idSet)
		{
			String name = idMap.get(id);
			System.out.print(name + " ");
		}
		System.out.println();
		
		//모든 이름의 성만 출력
		Iterator<String> iter = idSet.iterator();
		while(iter.hasNext())
		{
			String id = iter.next();
			String name = idMap.get(id);
			System.out.println(name.charAt(0));
		}
		
		
	}

}
