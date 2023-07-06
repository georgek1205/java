package test;

public class Test01 {

	public static void main(String[] args) {

		
		//문제1
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		numbers[3] = 6;
		
		//문제2
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		//문제3
		for(int i = numbers.length - 1; i >= 0; i--)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		//문제4
		for(int i = 1; i < numbers.length; i += 2)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		//문제5
		int j = 0;
		for(; j < numbers.length; j++)
		{
			if(numbers[j] == 2)
			{
				break;
			}
		}
		System.out.println("2가 들어 있는 index : " + j);
		
		//문제6
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if(max < numbers[i])
			{
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
		//문제7
		int min = numbers[0];
		int minidx = 0;
		for(int i = 1; i < numbers.length; i++)
		{
			if(min > numbers[i])
			{
				min = numbers[i];
				minidx = i;
			}
		}
		System.out.println("최소 값 index : " + minidx);
		//문제8
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
		
	}

}
