package ex;

public class Ex01 {

	public static void main(String[] args) {

		//우리가 그동안 썻던거는 싱글쓰레드였는데 지금부터는 멀티쓰레드를 구현할거다
//		ThreadExtends thread1 = new ThreadExtends("###");
//		ThreadExtends thread2 = new ThreadExtends("$$$");
//		
		//thread1.run(); 은 함수를 사용하는거고 쓰레드를 활용하라면 start()를 사용해야한다.
//		thread1.start();
//		thread2.start();
//		위 코드는 ThreadExtends만 써서구현하는법.
		
		ThreadImplements threadImple = new ThreadImplements("###");
		Thread thread = new Thread(threadImple);
		
		
		thread.start();
		
		//특정Thread가 끝나기를 기다리고싶을
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("main thread End");
		//이 부분에서 컴파일을 하면, 위 문자열이 먼저 출력이된다.
	}

}
