package ex.ex01;

public class Student extends Person{

	private String school;
//	private String name;
//	private int age;
	
	//student객체를 생성하면 부모가 먼저 객채화를한다.그리고 student가 생성 된다
	//만약에 기본생성자를(c++때배웟던 parameter아무것도 안받는 빈 생성자)안만들면 밑에 코드가다운
	public Student(String name, int age, String school)
	{
//		this.name = name;
//		this.age = age;
		//super은 생성자에서만 사용가능하고, 가장윗줄에서만 호출가능하다
		super(name, age); 
		this.school = school;
		
	}
	
	
	@Override
	public void printInfo()
	{
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
		super.printInfo();
		System.out.println("학교 : " + school);
	}
	
	
}
