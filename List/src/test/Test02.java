package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(20, 3, 5, 84, 17));
		System.out.println(arr);
		
		//문제2
		int min = arr.get(0);
		for(int i = 1; i < arr.size(); i++)
		{
			if(arr.get(i) < min)
			{
				min = arr.get(i);
			}
		}
		System.out.println(min);
		
		//문제3
		int sum = 0;
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext())
		{
			sum += iter.next();
		}
		System.out.println(sum);
		
		//문제4
		Iterator<Integer> iter2 = arr.iterator();
		while(iter2.hasNext())
		{
			if(iter2.next() % 2 == 0)
			{
				iter2.remove();
			}
			
		}
		System.out.println(arr);
	}

}
