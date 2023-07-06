package ex.ex01;

public class Person {

//	protected String name;
//	protected int age;
//	
	private String name;
	private int age;
		
	
	public Person()
	{
		System.out.println("person 생성!");
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//객체정보 출력 기능
	public void printInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
}
