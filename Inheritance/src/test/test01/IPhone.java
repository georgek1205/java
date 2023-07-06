package test.test01;

public class IPhone extends IPodTouch{

	
		private String number;
		
		public IPhone(String maker, String model, String number)
		{
			super();
			this.number = number;
		}
		//String maker, String model들을 parameter로 보내도 super()은 기본생성자를 호출하기때문에 굳이 안써도되고, 밑에 setModel이랑 통합시켜도된다(setModel 함수에 super()을
		//넣어서 간결하게도 가능).
		//슈퍼를 또 굳이 안써도된다.
	
		public void setModel(String model) 
		{
	        super.setModel(model);
	    }
		
	
		public String infoString() 
		{
	        return super.infoString();
	    }
		
		
		public void internetBrowsing(String url) //이걸굳이 여기서 만들지말고, main에서 바로 활용해보자
		{
	        super.internetBrowsing(url);
	        
	    }
		
		public void playMusic(String musicName) //이걸굳이 여기서 만들지말고, main에서 바로 활용해보자
		{
			super.playMusic(musicName);
		}
		
		public void call(String number)
		{
			System.out.println(number + "로 통화 중");
		}
		
		public void message(String number, String content)
		{
			System.out.println(number + "로 " + content + "전송");
		}
		
		public String getPhone()
		{
			return number;
		}
		
		//010-000-0000 로 통화 중
		//010-1111-2222 로 ㅋㅋㅋㅋ 전송
}
