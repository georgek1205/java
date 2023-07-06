package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

			//Set은 순서가없다.
			//Set는 중복된값이 없다.
		
			Set<Integer> set1 = new HashSet<>();
			set1.add(10);
			set1.add(20);
			set1.add(30);
			
			System.out.println(set1);
			
			
			Set<Integer> set2 = new HashSet<>();
			set2.add(10);
			set2.add(50);
			set2.add(30);
			
			//교집합
//			set1.retainAll(set2);
			System.out.println(set1);
			
			//합집합
			set1.addAll(set2);
			System.out.println(set1);
			
			
			//반복문
			for(int number : set1)
			{
				System.out.print(number + " ");
			}
			
			Iterator<Integer> iter = set1.iterator();
			while(iter.hasNext())
			{
				int number = iter.next();
				System.out.print(number + " ");
			}
	}

}
