package test.test2;

public class Test02 {

	public static void main(String[] args) {

		
		//Q1
		Circle example = new Circle(8);
		System.out.println("Area of a circle : " + example.getArea());
		System.out.println("Circumference of a circle : : " + example.getCircum());
		System.out.println("Area of 25 circles : : " + example.getArea(25));
		
		
		//Q2
		product shrimp = new product("Chip", 1300, "2021-03-02");
		System.out.println("Name : " + shrimp.getName());
		System.out.println("Price : " + shrimp.getPrice());
		System.out.println("Expiration Date : " + shrimp.getDate() + "\n");
		
		System.out.println("Price of 5 products : " + shrimp.getPrice(5));
		System.out.println("Price of 13 products : " + shrimp.getPrice(13));
		shrimp.isValid();
	}

}
