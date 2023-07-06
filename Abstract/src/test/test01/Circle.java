package test.test01;

public class Circle extends Shape{

	private double radius;
	
	public Circle(double radius)
	{
		super("원");
		this.radius = radius;
	}
	
	
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
	
	public double getLength()
	{
		return 2 * 3.14 * radius;
	}
	
	
}
