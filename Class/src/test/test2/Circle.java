package test.test2;

public class Circle {

		double radius, circum, area, pi = 3.14;
		
		public Circle(double radius)
		{
			this.radius = radius;
		}
	
		public double getArea()
		{ 
			return area = radius * radius * pi;
		}
	
		public double getCircum()
		{
			return circum = 2 * radius * pi;
		}
		
		public double getArea(int count)
		{
			return area = radius * radius * pi * count;
		}
	
}
