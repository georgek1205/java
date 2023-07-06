package ex.ex02;

public class Rectangle {

	
	int width, height, area;
	
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	int getArea()
	{
		return area = width * height;
	}
	
	
	int getArea(int count)
	{
		return width * height * count;
	}
	
	
}
