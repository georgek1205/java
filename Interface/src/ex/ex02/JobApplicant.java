package ex.ex02;

public class JobApplicant implements JavaProgramming{

		private String name, birthday;
		private double grade;
	
		public JobApplicant(String name, String birthday, double grade) 
		{
			this.name = name;
			this.birthday = birthday;
			this.grade = grade;
		}
		
		public String toString()
		{
			return "안녕하세요 저는 " + name + "입니다. 제 생년월일은 " + birthday + "에요. 그리고 제 학점은 " + grade + "입니다";
		}
		
		public void objectOriented()
		{
			System.out.println("자바는 객체지향 프로그래밍을 기반으로 만들어진 언어입니다 블라 블라");
	
		}
}
