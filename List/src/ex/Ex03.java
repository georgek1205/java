package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
			List<Integer> numberList = new ArrayList<>();
			numberList.add(5);
			numberList.add(3);
			numberList.add(8);
			numberList.add(1);
			numberList.add(4);
			numberList.add(6);
			
			//특정 값이 존재하는지 확인
			if(numberList.contains(4))
			{
				System.out.println("8은 있다!!!");
			}
			
			//정렬
			numberList.sort(null);
			System.out.println(numberList);
			numberList.sort(Comparator.reverseOrder());
			System.out.println(numberList);
			
			if(numberList.isEmpty())
			{
				System.out.println("비어있다");
			}
	}

}
