package ex;


public class Ex01 {

	public static void main(String[] args) throws Exception{

			String text = null;
//			if(text != null)
//			{
//				text.length();
//			}
			
			int[] numbers = new int[5];
			
			try
			{
				text.length();
			}
			catch(NullPointerException e)
			{
				System.out.println("null인상태에서 메소드 실행해서 NPE 발생");
			}
			
			try 
			{
				System.out.println(numbers[5]);
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("배열 크기를 벚어났다");
			}
			
			//일정시간 동안 프로그램이 멈춘다. 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("sleep 실패!");
			}
			
			System.out.println("끝!");
			
			try 
			{
				printNumber(-1);
			} catch (Exception e) 
			{
				System.out.println("수 범위가 벚어났습니다.");
			}
			
			printNumber(1); //이거 이렇게하면 메인으로 에라모르겟다 throw하는데 딱히좋지않은방이다
	}
	
	public static void printNumber(int number) throws Exception
	{
		if(number < 1 || number > 10)
		{
			//exception 발생
			throw new Exception();
		}
		System.out.println(number);
	}
}
