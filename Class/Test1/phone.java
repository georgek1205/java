package test.test1;

public class phone {

	public String company;
	public String model;
	public String number;
	
	
	public phone(String company, String model, String number)
	{
		this.company = company;
		this.model = model;
		this.number = number;
	}
	
	public void print()
	{
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.number);
	}
	
	
	
	
}
