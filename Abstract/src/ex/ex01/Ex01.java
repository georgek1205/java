package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {


//		Animal animal = new Animal(); 추상클래스는 객체 생성불
		Dog dog = new Dog();
		dog.eat();
		dog.cry();
		
		Animal animal = new Cat();
		animal.eat();
		animal.cry();
		
		animal = dog;
		animal.cry();
	}

}
