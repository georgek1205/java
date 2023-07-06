package test;

public class Test01 {

	public static void main(String[] args) {
			
		
		ThreadExtends tiger = new ThreadExtends("어흥");
		Thread tiger_1 = new Thread(tiger);
		
		ThreadExtends cow = new ThreadExtends("음메~");
		Thread cow_1 = new Thread(cow);
		
		ThreadExtends animal = new ThreadExtends("히잉");
		Thread animal_1 = new Thread(animal);
		
		tiger_1.start();
		cow_1.start();
		try 
		{
			tiger_1.join();
			cow_1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		animal_1.start();
		
		//(중요한 질문)
		//오버라이드 : 부모의 메소드를 재정의, 근데 파라미터랑 리턴타입은 똑같다
		//오버로드 : 파라미터랑 리턴타입이 다를수있다.
		
		//프로세스 vs 쓰레드 (중요한 질문)
		//프로세스는 메모리를 독립적으로 사용한다.
		//쓰레드는 프로세스의 단위
		
		//만약 두개의 쓰레드가 존재한다고 가정했을때 cpu는 두 쓰레드를 동시에 실행시키지않는다. 두 쓰레드를 왓다갓다하면서 실행한다(context switching). 하지만 이건
		//고전 이론이다. 지금은 동시에 실행한다. 현재 cpu의 코어가많을수록 동시에 실행할수있다. 
	}

}
