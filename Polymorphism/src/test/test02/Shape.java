package test.test02;

public class Shape {
		private String name;
	
		//public Shape(){} 가 항상 기본생성자로 존재한다. 만약 다른형태의 생성자를 정의해주면 존재가 유효하지않는다.
		public Shape(String name)
		{
			this.name = name;
		}
		public double getArea()
		{
			return 0; //더블 리턴이여서 아무거나 그냥 리턴해야한다. 오버라이딩이여서 상관없다.
		}
		
		public void printArea()
		{
			System.out.println(name + "의넓이는 "+ getArea() + "cm^2 입니다.");
		}
		
}
