package ex;

public class Ex02 {

	public static void main(String[] args) {

		int price = getCandyPrice(6);
		System.out.println("6개의 가격 " + price + "원");
		
		//54, 72 를 더하기 계산
		int sum = addnumbers(54, 72);
		System.out.println(sum);
		
		//1부터 10까지의 더한 결과를 출력
		System.out.println(summation(1, 10));
	}
	
	public static int getCandyPrice(int count)
	{
		int result = count * 250;
		return result;
	}

	
	public static int addnumbers(int number1, int number2)
	{
		int result = number1 + number2;
		return result;
	}

	public static int summation(int a, int b)
	{
		int sum = 0;
		for(int i = a; i <= b; i++)
		{
			sum+=i;
		}
		return sum;
	}
	
}
