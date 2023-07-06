package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

			//백터는 메모리문제, 동기화가 기본값이기때문에 자바에서 안쓴다.
			//문제1
			List<Integer> arr = new ArrayList<>();
			//ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
			arr.add(3);
			arr.add(8);
			arr.add(9);
			arr.add(4);
			arr.add(2);
			arr.add(1);
			arr.add(7);
			arr.add(5);
			System.out.println(arr);
			
			//문제2
			arr.set(3, 6);
			System.out.println(arr);
			
			//문제3
			arr.add(2, 10);
			System.out.println(arr);
			
			//문제4
			arr.remove(1);
			arr.remove(6);
			System.out.println(arr);
	}

}
