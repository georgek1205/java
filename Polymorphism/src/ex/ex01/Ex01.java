package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

//		Animal animal = new Animal();
//		animal.eat();
//		
//		Dog dog = new Dog();
//		dog.lash();
//		dog.eat();
		
		//업캐스팅
		Animal animal = new Dog(); //Dog객채 전체를 저장한게 아니라 animal객채 부분만 저장한거다(Dog 객체는 제외)
		animal.eat();
//		animal.lash(); 컴파일다운
		
		Cat cat = new Cat();
		Animal animal2 = cat; //자식객채들은 부모타입으로 저장가능
		animal2.eat();
//		animal2.grooming(); 컴파일 다운
		
		//그림으로 생각했을떄, 큰틀은 자식객체고, 자식객체에는 부모객체가 따로 들어가있다고 생각하자.
		
		
		Dog dog = new Dog();
		//다형성 활용
		System.out.println();
		eatAnimal(cat);
		eatAnimal(dog);
		
		Animal[] animals = {cat, dog};
		for(int i = 0; i < animals.length; i++)
		{
			animals[i].eat(); 
			animals[i].cry();
			
			//개인 경우면, 꼬리 흔들기
			if(animals[i] instanceof Dog)
			{
				Dog dog2 = (Dog)animals[i];
				dog2.lash();
			}
			
			
		}
	}

	//동물의 밥을 먹이는 기능
	//eat는 부모안에 들어가있으니까 간단하게 활용가능.
	public static void eatAnimal(Animal animal)
	{
		animal.eat();
	}
	

	
}
