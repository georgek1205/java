package test.test02;


public class OmrCard {

		private int[] omr = new int[5];
		private String sid, name;
		
		public OmrCard(String sid, String name)
		{
			this.sid = sid;
			this.name = name;
		}
	
		public void getName()
		{
			System.out.println("이름 : " + name);
		}
	
		public void getSid()
		{
			System.out.println("학번 : " + sid);
		}
		
		public void setAnwer(String answer)
		{
			String[] temp = answer.split(",");
			for(int i = 0; i < omr.length; i++)
			{
				omr[i] = Integer.parseInt(temp[i]);
			}
		}
		
		public int[] getArray()
		{
			return omr;
		}
		
}
