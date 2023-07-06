package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {

		Rectangle bigRectangle = new Rectangle(40, 80);
		
		System.out.println("Area of a big triangle : " + bigRectangle.getArea());
		System.out.println("Area of 5 big triangle : " + bigRectangle.getArea(5));
		System.out.println();
		
		Rectangle smallRectangle = new Rectangle(5, 4);
		
		System.out.println("Area of a small triangle : " + smallRectangle.getArea());
		System.out.println("Area of 7 small triangle : " + smallRectangle.getArea(7));
		System.out.println();
	
	}

}
