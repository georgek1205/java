package test.test02;


class Tool{
	private int amount;
	
	public Tool(){}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
}

class SharpPencil extends Tool{ // 샤프펜슬
    private int width; // 펜의 굵기

    public SharpPencil(int width)
    {
    	super();
    	this.width = width;
    }
}


class Pen extends Tool{ // 만년필
    private String color; // 볼펜의 색
    
    public Pen() {};
    public Pen(String color)
    {
    	super();
    	this.color = color;
    }
    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }
}

class BallPen extends Pen{
	public BallPen(){}
	public void refill (int n) { 
        setAmount(n); 
    }
}
