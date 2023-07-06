package ex.ex02;

public class Naver {

		private String name, scale;
		private int headcount;
	
	
		public Naver()
		{
			this.name = "네이버";
			this.scale = "대기업";
			this.headcount = 30239;
		}
		
		public String toString()
		{
			return name + " : " + scale + " 직원수 : " + headcount;
		}
		
		//자바 개발자 채용 공고
		public void recruitJavaProgrammer(JavaProgramming applicant)
		{
			//전달 받은 지원자의 자바 수행기능을 확인
			System.out.println(applicant);
			applicant.objectOriented();
		}
		
}
