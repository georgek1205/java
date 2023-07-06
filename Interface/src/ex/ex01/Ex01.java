package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
			Dog dog = new Dog();
			dog.eat();
			dog.cry();
			dog.lash();
		
//			Animal animal = new Animal(); 다운
			Animal animal = dog;
			animal.cry();
			animal.eat();
			
	}

}
