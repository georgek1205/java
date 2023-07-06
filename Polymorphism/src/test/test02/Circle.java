package test.test02;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius)
	{
		super("원");
		this.radius = radius;
	}
	public double getArea()
	{
		return radius * radius * 3.14;
	}
	
	
	
}
