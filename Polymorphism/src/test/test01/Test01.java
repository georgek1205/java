package test.test01;

public class Test01 {

	public static void main(String[] args) {
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		Animal[] animals = {animal1, animal2};
		boolean approve = true;
		
		
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] instanceof Cat && approve)
			{
				((Cat)animals[i]).sound();
				((Cat)animals[i]).sound();
				((Cat)animals[i]).sound();
				//이거 그냥 오버라이딩되서 그냥 animals[i].sound() 해도 그냥 된다.
				//재정의
			}
			else if(animals[i] instanceof Dog && approve)
			{
				((Dog)animals[i]).sound();
				((Dog)animals[i]).sound();
				((Dog)animals[i]).sound();
				i = 0;
				approve = false;
			}
			if(animals[i] instanceof Cat && !approve)
			{
				((Cat)animals[i]).move();
			}
			if(animals[i] instanceof Dog && !approve)
			{
				((Dog)animals[i]).move();
			}
		}
		
	}

}
