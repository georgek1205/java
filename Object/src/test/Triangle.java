package test;

public class Triangle {

	private int width, height;
	
	public Triangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height / 2.0;
	}
	
	@Override
	public String toString()
	{
		return "밑변 : " + width + " 높이 : " + height + " 넓이 : " + getArea();
	}
	
	
}
