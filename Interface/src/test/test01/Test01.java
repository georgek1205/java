package test.test01;

public class Test01 {
	public static void main(String[] args) {
		
		JYPEntertainment jyp = new JYPEntertainment();
		
		EntertainerApplicant applicant = new EntertainerApplicant("김승규", 17);
		
		jyp.idolAudition(applicant);
		jyp.actorAudition(applicant);
		
	}
}
