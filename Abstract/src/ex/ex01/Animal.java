package ex.ex01;

public abstract class Animal {
		//추상맴버를 하나라도가지면 추상클래스다.
	
		public void eat()
		{
			System.out.println("냠");
		}
		
		//우는기능
		//상속기반으로 자식 클래스에서 구현하기를 바라는 메소
		
		public abstract void cry();
		
}
