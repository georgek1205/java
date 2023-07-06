package test.test01;

public class Test01 {

	public static void main(String[] args) {

		IPhone phone = new IPhone("apple", " ", "010-1234-5678"); 
		//아이폰클래스에서 앞 두 parameter들은 어차피 보내봣자 의미가 없어서 그냥 번호만 보내던지
		phone.setModel("iPhone");
		
		System.out.println(phone.infoString() + "\n" + phone.getPhone());
		//이것도 그냥 아이폰 클래스안에서 super쓰지말고 어차피 extends로 상속을 받았으니까, 그냥 바로 메인에서 써버려도된다. 방법은맞지만 굳이 그렇게하지않아도된다.
		//아니면 아이폰클래스에서  infoString()을 오버라이딩해서 super.infoString() 하고 getPhone()을 추가해서 한번에 해버리자.
		// 강조 : 최대한 부모클래스의 스타일을 따라가자, 그리고 활용도하자. 추가해야할 항목들을 최소하하자.
		
		
		
		phone.internetBrowsing("https://www.google.com");
		phone.call("010-000-0000");
		phone.message("010-1111-2222", "ㅋㅋㅋㅋ");
		
	}

}
