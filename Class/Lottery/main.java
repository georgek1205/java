package test.test03;

public class Test03 {

	public static void main(String[] args) {

		LottoChecker check = new LottoChecker();
		check.printChecker();
		Lotto hander = new Lotto("41 4 11 20 38 45");
		Lotto auto_hander = new Lotto();
		check.handChecker(hander.getHand());
		check.handChecker(auto_hander.getHand());
		
	}

}
