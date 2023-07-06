package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

		public static void main(String[] args) {
			
			//리스트/ 인덱스기반 반복문
			List<String> fruitList = new ArrayList<>();
			fruitList.add("apple");
			fruitList.add("banana");
			fruitList.add("grape");
			
			for(int i = 0; i < fruitList.size(); i++) //index가 필요할때
			{
				//String fruit = fruitList.get(i); 가 밑에있는 foreach 랑 같은 용도
				System.out.print(fruitList.get(i) + " ");
			}
			System.out.println();
			
			
			//향상된 for문 - foreach
			//객체에서 하나씩 끄집어서 fruit에 저장
			// 
			for(String fruit:fruitList) //인덱스는 상관없고 값만 출력하고싶을때
			{
				System.out.println(fruit);
			}
			System.out.println();
			//Iterator
			//벨코즈처럼 맨앞인덱스전에잇는데, element가있는지 감시하는친구
			Iterator<String> iter = fruitList.iterator();
			while(iter.hasNext())
			{
				String fruit = iter.next();
				System.out.print(fruit + " ");
				if(fruit.equals("banana"))
				{
					iter.remove();
				}
			}
			
			//왜 iterator을 쓰는게 좋을까. banana라는 문자열을 엄청많이 추가해놨다고 가정해보자. 그리고 바나나만 지우는 조건을 반복문에 추가한다고 가정해보자 근데 만약에 맨위에있는 정석
			//반복문으로 돌리면, fruitList.remove(i). 를 하게되는데, 이런식으로하면 삭제될때마다 인덱스가 댕겨지기때문에 맨처음 절대인덱스가 유지가안되기때문에 삭제가 안된는 값들이존재한다.
			//2번째
			
		}
}
