package test.test1;

public class student {

	
	public String name;
	public int age;
	public String course;
	public String phone;
	
	public student(String name, int age, String course, String phone)
	{
		
		this.name = name;
		this.age = age;
		this.course = course;
		this.phone = phone;
		
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
		System.out.println(phone);
		System.out.println("");
		
	}
	
}
