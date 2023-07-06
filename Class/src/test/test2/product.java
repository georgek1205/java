package test.test2;

public class product {

		public String name, date;
		public int price;
		
		public product(String name, int price, String date)
		{
			this.name = name;
			this.price = price;
			this.date = date;
		}
	 
		public String getName()
		{
			return name;
		}
	
		public int getPrice()
		{
			return price;
		}
	
		public String getDate()
		{
			return date;
		}
		
		public int getPrice(int number)
		{
			return price * number;
		}
		
		
		public void isValid()
		{
			String[] valid = date.split("-");
			if(Integer.parseInt(valid[0]) >= 2023)
			{
				if(Integer.parseInt(valid[0]) == 2023)
				{
					if(Integer.parseInt(valid[1]) > 6)
					{
						System.out.println("판매 가능 상품");
						return;
					}
					else
					{
						if(Integer.parseInt(valid[1]) == 6)
						{
							if(Integer.parseInt(valid[2]) > 13)
							{
								System.out.println("판매 가능 상품");
								return;
							}
							else
							{
								System.out.println("판매 불가 상품");
								return;
							}
						}
						else
						{
							System.out.println("판매 불가 상품");
							return;
						}
					}
				}
				else
				{
					if(Integer.parseInt(valid[0]) > 2023)
					{
						System.out.println("판매 가능 상품");
						return;
					}
				}
			}
			else
			{
				System.out.println("판매 불가 상품");
				return;
			}
			
			
			
		}
		
		
}
