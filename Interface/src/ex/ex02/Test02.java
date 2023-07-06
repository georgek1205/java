package ex.ex02;

public class Test02 {

	public static void main(String[] args) {

			//구직자, 회사
			//채용공고
		
			Naver naver = new Naver();
			
			JobApplicant applicant = new JobApplicant("김승규", "20011107", 3.8);
			System.out.println(naver);
			System.out.println(applicant);
			
			
			naver.recruitJavaProgrammer(applicant);
	}

}
