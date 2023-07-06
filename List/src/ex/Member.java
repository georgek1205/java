package ex;

public class Member {

	
		private String name, phoneNumber;
		
		public Member(String name, String phoneNumber)
		{
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
	
		public String getName()
		{
			return name;
		}
		
		public String getPhoneNumber()
		{
			return phoneNumber;
		}
		
		public String toString()
		{
			return name + " " + phoneNumber;
		}
		
		
}
