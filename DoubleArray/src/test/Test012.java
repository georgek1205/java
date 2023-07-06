package test;

import java.util.Scanner;

public class Test012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//문제1
		int[][] arr = new int[2][3];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = 10;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//문제2
		int[][] arr2 = new int[3][4];
		for(int i = 0; i < arr2.length; i++)
		{
			int row = 1;
			for(int j = 0; j < arr2[i].length; j++)
			{
				arr2[i][j] = row++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//문제3
		int[][] arr3 = new int[3][3];
		for(int i = 0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3[i].length; j++)
			{
				arr3[i][j] = (i+1);
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//문제4
		int[][] arr4 = new int[5][5];
		for(int i = 0; i < arr4.length; i++)
		{
			for(int j = 0; j < arr4[i].length; j++)
			{
				if(i == 2 || j == 2)
				{
					arr4[i][j] = 1;
					System.out.print(arr4[i][j] + " ");
				}
				else
				{
					System.out.print(arr4[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//문제5
		int[][] arr5 = new int[3][3];
		int cnt = 1;
		for(int i = 0; i < arr5.length; i++)
		{
			for(int j = 0; j < arr5[i].length; j++)
			{
				arr5[i][j] = cnt++;
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//문제6
		int[][] arr6 = new int[3][3];
		int fill = 1;
		for(int i = 0; i < arr6.length; i++)
		{
			for(int j = 0; j < arr6[i].length; j++)
			{
				arr6[j][i] = fill++;
			}
		}
		for(int i = 0; i < arr6.length; i++)
		{
			for(int j = 0; j < arr6[i].length; j++)
			{
				System.out.print(arr6[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
