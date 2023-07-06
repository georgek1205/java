package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
			
		//문제1
		List<Product> store = new ArrayList<>();
		store.add(new Product("새우깡", 1200, 150));
		store.add(new Product("육개장", 850, 30));
		store.add(new Product("신라면", 800, 15));
		store.add(new Product("천마표팝콘", 1500, 0));
//		for(Product list : store)
//		{
//			System.out.println(list);
//		}
		
		System.out.println(store);
		
		//문제2
		Iterator <Product> iter = store.iterator();
		while(iter.hasNext())
		{
			Product delete = iter.next();
			if(delete.getQuantity() == 0)
			{
				iter.remove();
			}
		}
		System.out.println(store);
		
		//문제3
		Scanner scan = new Scanner(System.in);
		System.out.print("제품명 : ");
		String want = scan.nextLine();
		System.out.print("개수 : ");
		int quantity = scan.nextInt();
		
		Iterator <Product> iterforsell = store.iterator();
		while(iterforsell.hasNext())
		{
			Product sell = iterforsell.next();
			if(sell.getName().equals(want))
			{
				sell.setQuantity(sell.getQuantity() - quantity);
			}
		}
		System.out.println(store);
		
		//문제4
		for(Product check : store)
		{
			if(check.getQuantity() <= 30)
			{
				System.out.println(check);
			}
		}
	}

}
