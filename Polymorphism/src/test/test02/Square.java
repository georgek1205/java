package test.test02;

public class Square extends Shape{

	private double width;
	private double height;
	
	public Square(double width, double height)
	{
		super("사격형");
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height;
	}
}
