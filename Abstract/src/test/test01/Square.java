package test.test01;

public class Square extends Shape{

	private double width, length;
	
	public Square(double width, double length)
	{
		super("사각형");
		this.width = width;
		this.length = length;
	}
	
	
	public double getArea()
	{
		return width * length;
	}
	
	public double getLength()
	{
		return 2 * (width + length);
	}
	
	
}
