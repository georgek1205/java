package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
			int number = 10;
			
			//래퍼 클래스
			Integer number2 = 10;
			System.out.println(number2);
		
			//deprecated 
			Integer number3 = new Integer(10);
			if(number2 == number3)
			{
				System.out.println("number2와 number3이 == 로 같다");
			}
			
			if(number2.equals(number3))
			{
				System.out.println("number2와 number3이 같다");
			}
			
			//기본 자료형과 래퍼클래스의 비교
			if(number == number2)
			{
				System.out.println("number와 number2 같다");
			}
			
			if(number == number3)
			{
				System.out.println("number와 number3 같다");
			}
			
			number = number2;
			number2 = number;
			
			
	}

}
