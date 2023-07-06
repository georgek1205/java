package test.test2;

public class Test02 {

	public static void main(String[] args) {

		
		//문제1
		Circle example = new Circle(8);
		System.out.println("원의 넓이 : " + example.getArea());
		System.out.println("원의 둘레 : : " + example.getCircum());
		System.out.println("원 25개 넓이 : : " + example.getArea(25));
		
		
		//문제2
		product shrimp = new product("새우깡", 1300, "2021-03-02");
		System.out.println("이름 : " + shrimp.getName());
		System.out.println("가격 : " + shrimp.getPrice());
		System.out.println("유통기한 : " + shrimp.getDate() + "\n");
		
		System.out.println("제품 5개의 가격 : " + shrimp.getPrice(5));
		System.out.println("제품 13개의 가격 : " + shrimp.getPrice(13));
		shrimp.isValid();
	}

}
