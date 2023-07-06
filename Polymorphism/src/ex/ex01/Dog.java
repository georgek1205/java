package ex.ex01;

public class Dog extends Animal{

		//꼬리 흔들기 기능
		public void lash()
		{
			System.out.println("살랑살랑");
		}
	
		
		@Override
		public void cry()
		{
			System.out.println("멍멍");
		}
		
	
}
