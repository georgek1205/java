package test.test1;

public class Test01 {

	public static void main(String[] args) {

		
		phone domestic = new phone("samsung", "갤럭시s10e", "01012345678");
		domestic.print();
		
		phone overseas = new phone("apple", "iPhoneSE", "0109876543");
		overseas.print();
		
		System.out.println();
		
		//문제2
		student ryu = new student("유재석", 21, "java", "01023453223");
		ryu.print();
		
		student lee = new student("이효리", 23, "java", "01096482734");
		lee.print();
		
		student[] arr = new student[2];
		
	}

}
