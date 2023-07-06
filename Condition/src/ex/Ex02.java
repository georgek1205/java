package ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//몸무게가 70이 넘지 않고, 만보를 걸으면 치킨을먹
	
		int weight = 72;
		int walking = 10010;
		if(weight <= 70 && walking >= 10000)
		{
			System.out.println("치킨 먹자");
		}
		
		//몸무게가 70이하거나, 만보를 걸으면 치킨먹자
		//만약 70이하다, 또는 만보를 걷는다 그러면 치킨먹자
		if(weight <= 70 || walking >= 100000)
		{
				System.out.println("치킨먹자!!!");
		}
		
		int number = 3;
		
		if(4 <= number && number <= 10)
			System.out.println("4보다 크고 10보다 작다");
		
		if(number < 4 || number > 10)
			System.out.println("4보다 작거나 10보다 크다");
		
		//두 점수 합격
		System.out.print("두 점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int first_score = scan.nextInt();
		int second_score = scan.nextInt();
		
		if(first_score >= 70 && second_score >= 70)
			System.out.println("합격입니다");
		
		//공배수 구하기
		System.out.print("수를 입력하세요 : ");
		int cdm = scan.nextInt();
		if(cdm % 2 == 0 && cdm % 3 == 0)
			System.out.println(cdm + "는 2와 3의 공배수 입니다");
		
		//범위
		System.out.print("1~10 사이의 수를 입력 하세요 : ");
		int range = scan.nextInt();
		if(range < 1 || range > 10)
			System.out.println("잘못 입력 하셨습니다.");
		
	}

}
