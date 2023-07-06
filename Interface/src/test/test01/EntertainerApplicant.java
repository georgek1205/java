package test.test01;

public class EntertainerApplicant implements Sing, Act{

		private String name;
		private int age;
		
		public EntertainerApplicant(String name, int age)
		{
			this.name = name;
			this.age = age;
		}
		
		public String toString()
		{
			return "안녕하세요 " + name + "입니다. 나이는 " + age + "에요.";
		}
		
		public void singASong()
		{
			System.out.println("스파이시~ 스 스파이시~");
		}

		public void methodAct()
		{
			System.out.println("연기자연기자연기");
		}
		
}
