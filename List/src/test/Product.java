package test;

public class Product {
		private String name;
		private int price, quantity;
		
		public Product(String name, int price, int quantity)
		{
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public String toString()
		{
			return "제품명 : " + name + " 가격 : " + price + " 재고 : " + quantity;
		}
		
		public int getQuantity()
		{
			return quantity;
		}
		
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		
		public String getName()
		{
			return name;
		}
}
