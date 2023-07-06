package ex;

public class Ex03 {

	public static void main(String[] args) {

		String text = "Hello";
		
		//문자열 길이 구하기
		int length  = text.length();
		System.out.println(length);
		System.out.println(text + "의 길이는 " + text.length());
		
		//문자 위치 구하기
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		
		//문자열을 문자들을 통해서 출력
		for(int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		//문자열 자르기
		String phoneNumber = "01012345678";
		String part = phoneNumber.substring(7);
		System.out.println(part);
		
		//특정문자열로 시작, 끝 확인
		String name = "김승규";
		boolean isKim = name.startsWith("김");
		System.out.println(isKim);
		if(isKim)
		{
			System.out.println("김씨 입니다");
		}
		
		//이름이 승규 인지 확인
		if(name.endsWith("승규"))
		{
			System.out.println("이름이 승규다");
		}
		
		//문자열바꾸기
		String newName = name.replace("승규", "강철");
		System.out.println(newName);
		
		//문자열 쪼개기
		String members = "김승규, 유재석, 하하, 황광희, 조세호";
		String[] arr = members.split(",");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
	}

}
