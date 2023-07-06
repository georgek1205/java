package test.test02;

public class test02 {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Square(7, 13);
        shape[2] = new Circle(12);

        
        //노트 : 일단 가장먼저 우리는 모든 객체들을 Shape(부모)에저장을 할거다. 근데, 초반에 부모에 딱히 뭘 할건필요없고 공통으로 오버라이딩할 함수만 정의해주자. 그 이유는, 원, 삼각형(사각형)은
        //변수들이 다 다르기 때문에. 접근하기가 까다롭다. 그래서, 부모에는 그냥 공통으로 쓸수잇을거만 생각을 먼저하고, 각각의 객체 특성을 살리자.
        
        
		for(int i = 0; i < shape.length; i++)
		{
			shape[i].printArea();
		}
		
	}

}
