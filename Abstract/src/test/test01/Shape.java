package test.test01;

public abstract class Shape {
	
		private String name;
		
		public Shape(String name)
		{
			this.name = name;
		}
		
		public abstract double getArea();
	
		public abstract double getLength();
	
		public void printArea()
		{
			System.out.println(name + " 넓이 : " + getArea() + " 둘레 : " + getLength());
		}
}
