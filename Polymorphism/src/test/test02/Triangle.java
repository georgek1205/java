package test.test02;

public class Triangle extends Shape{

	private double width;
	private double height;
	
	public Triangle(double width, double height)
	{
		super("삼격형");
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height / 2.0;
	}
}
