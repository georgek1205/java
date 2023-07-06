package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

			ArrayList<Integer> integerList = new ArrayList<>();
			integerList.add(25);
			integerList.add(10);
		
			System.out.println(integerList);
			
			integerList.add(1, 20);
			
			System.out.println(integerList);
			integerList.get(2);
			
			
			int number2 = integerList.get(1);
			System.out.println(number2);
			System.out.println(integerList.get(0));
			
			integerList.set(0, 30);
			System.out.println(integerList);
			
			//값 삭제
			integerList.remove(2);
			System.out.println(integerList);
			
			//문자열리스트
			List<String> stringList = new ArrayList<>();
			stringList.add("apple");
			stringList.add("bear");
			stringList.add("chair");
			System.out.println(stringList);
			
			//문자열리스트 삭제
			stringList.remove("bear");
			System.out.println(stringList);
			
	}

}
