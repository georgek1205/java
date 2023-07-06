package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//객채 생성
		ScoreData korean = new ScoreData();
		
		korean.name = "국어";
		korean.score = 90;
		korean.ranking = 8;
		
		System.out.println("과목 : " + korean.name);
		System.out.println("점수 : " + korean.score);
		System.out.println("석차 : " + korean.ranking);
		
		ScoreData english = new ScoreData();
		
		english.name = "영어";
		english.score = 85;
		english.ranking = 3;
		
		System.out.println("과목 : " + english.name);
		System.out.println("점수 : " + english.score);
		System.out.println("석차 : " + english.ranking);
		
		
	}

}

