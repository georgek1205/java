package ex;

public class Ex01 {

	public static void main(String[] args) {
/*
		int weight = 74;
		while(weight >= 70)
		{
			System.out.println("으쌰으쌰");
			weight -= 2;
		}
		
		int i = 0;
		while(i < 5)
		{
			System.out.println("Hello World!");
			i++;
		}
		
		
		i = 0;
		while(i < 5)
		{
			i++;
			System.out.println(i);
		}
		
		//5 ~ 1 까지 숫자 출력
		i = 5;
		while(i > 0)
		{
			System.out.println(i--);
		}
		
		//반복 횟수 제어
		i = 0;
		while(i < 10)
		{
			System.out.println("hi");
			i++;
		}
*/		
		//1 부터 10까지의 합 구하기.
		//1 + 2 + 3 + 4 + 5 + ..... + 10
		int i = 1;
		int sum = 0;
		while(i <= 10)
		{
			sum += i++;
		}
		System.out.println(sum);
		
		while(i < 5)
		{
			System.out.print("Hello World");
			i++;
		}
	}

}
