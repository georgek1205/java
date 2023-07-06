package ex;

public class Ex02 {

	public static void main(String[] args) {

		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		System.out.println(Integer.parseInt(numberString1) + Integer.parseInt(numberString2)); //문자열을 int로 바꾸는과
		
		
		//정수 -> 문자열
		int number3 = 100;
		int number4 = 200;
		
		String numberString3 = String.valueOf(number3);
		String numberString4 = String.valueOf(number4);
		
		System.out.println(numberString3 + numberString4);
		
		String numberString5 = number3 + "";
		String numberString6 = number4 + "";
		
		System.out.println(numberString5 + numberString6);
		

		//strcmp
		String word1 = "고양이";
		String word2 = "고양이";
		if(word1 == word2)
		{
			System.out.println("두 단어는 같다");
		}
		if(word1 == "고양이")
		{
			System.out.println("두단어는 같다222");
		}
		
		String word3 = new String("고양이");
		System.out.println(word3);
		
		if(word1 == word3) //스트링이 자바에서는 클래스인데 c처럼 가르킨다고 생각하자. 같은클래스가 아니기떄문에 false를 return.
		{
			System.out.println("두 단어는 같다 333");
		}
		
		if(word1.equals(word3))
		{
			System.out.println("두 단어는 같다444");
		}
		
	}

}
