package test.test02;

public class main {

	public static void main(String[] args) {


		OmrCard test = new OmrCard("George", "12345678");
		test.getName();
		test.getSid();
		test.setAnwer("1,2,3,4,5");
		OmrCardReader solution = new OmrCardReader();
		solution.getScore(test.getArray());
	
		
	}

}
