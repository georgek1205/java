package test;

import java.util.Random;
import java.util.Scanner;

public class Test01pphard {

	public static void main(String[] args) {

		//문제1
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 index를 입력 하세요 : ");
		int[] numbers = {3, 5, 2, 10, 39};
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		int temp = numbers[idx1];
		
		numbers[idx1] = numbers[idx2];
		numbers[idx2] = temp;
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println();
		//문제2
	
		int[] randnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
		    int randomNumber = rand.nextInt(10);
		    int temp2 = randnum[0];
		    randnum[0] = randnum[randomNumber];
		    randnum[randomNumber] = temp2; 
		    // swap 구현
		}
		for(int i = 0; i < randnum.length; i++)
		{
			System.out.print(randnum[i] + " ");
		}
		System.out.println();
		System.out.println();
		//문제3
		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
		int[] check = new int[numbers2.length + 2];
		for(int i = 0; i < numbers2.length; i++)
		{
			check[numbers2[i]]++;
		}
		for(int i = 1; i < check.length; i++)
		{
			if(check[i] == 0)
			{
				System.out.println("없는 수는 " + i + " 입니다");
			}
		}
		/*
		 int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};

		for (int i = 1; i <= 9; i++) {
		    boolean found = false;
		    for (int j = 0; j < arr.length; j++) {
		        if (arr[j] == i) {
		            found = true;
		            break;
		        }
		    }
		    if (!found) {
		        System.out.println("Missing number: " + i);
		    }
		}
		3번 답. 아에 외부포문을 1~9로 잡고, 불리안을통해 브레이크걸기. 하지만이중포문으로인해시간복잡도 증가.
		 */
		//문제4
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] frequency = new int[numbers3.length + 2];
		for(int i = 0; i < numbers3.length;i++)
		{
			frequency[numbers3[i]]++;
		}
		for(int i = 0; i < numbers3.length;i++)
		{
			if(frequency[i] != 0)
				System.out.println(i + " : " + frequency[i]);
		}
	}

}
