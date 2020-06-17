package src.javaStudy;
/*==========================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 변수(static 변수)와 클래스 메소드(static 메소드)
============================================================*/

// ※ 실습 편의상 접근제어지시자 생략


public class Test096
{
	// ※ 클래스 변수 또는 클래스 메소드는
	//	  클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며		//-- ex) 전투에 들어가기전에 무장상태 사전점검하는 개념
	//	  클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
	//	  즉, 『new』 연산자를 통해 메모리를 할당받지 않아도
	//	  사용이 가능하다는 것이다.
	static int a = 10;				//-- static 변수 (클래스 변수)

	// ※ 인스턴스 변수는
	//	  동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	//	  클래스 메소드에서는 접근할 수 없다.
	int b = 20;						//-- non-static 변수 (인스턴스 변수) instance 변수



	void write()					//-- non-static 메소드 (인스턴스 메소드)
	{
		System.out.println("클래스 변수 a : " + a);
		System.out.println("인스턴스 변수 b : "+ b);
	}

	static void print()				//-- static 메소드 (클래스 메소드)
	{
		
		System.out.println("클래스 변수 a : " + a);
		// System.out.println("인스턴스 변수 b : " + b); //-- 에러 발생
	}
	public static void main(String[] args)
	{
		System.out.println("main() → 클래스 변수 a : "+ a);
		//-- 같은 클래스 내부에 존재하기 때문에
		//	 클래스의 이름은 생략 가능
		//--==>> main() → 클래스 변수 a : 10

		System.out.println("main() → 클래스 변수 a : "+ Test096.a);
		//-- 클래스 변수에 접근하기 위해서는
		//	 『클래스명.변수명』의 형태로 접근이 가능하다.
		//--==>> main() → 클래스 변수 a : 10

		Test096.print();
		print();
		//--==>>클래스 변수 a : 10
		//		클래스 변수 a : 10
		//-- 클래스 메소드에서 클래스 메소드의 호출은 가능하며,
		//	 『클래스명.메소드명()』의 형태로 접근하여 호출하는 것이 가능하다.
		//	 또한, 지금은 같은 클래스 내부에 존재하기 때문에
		//   ***클래스의 이름을 생략하는 것이 가능하다.***

		//System.out.println("main() → 인스턴스 변수 b : " + Test096.b);
		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//--==>> 에러 발생

		//Test096.write();
		//write();
		//--==>> 에러 발생


		// Test096 클래스 기반 인스턴스 생성
		Test096 ob = new Test096();

		// 생성된 인스턴스를 통한 인스턴스 변수 접근
		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//--==>> 에러 발생

		System.out.println("main() → 인스턴스 변수 b : " + ob.b);
		//--==>> main() → 인스턴스 변수 b : 20

		// 생성된 인스턴스를 통한 인스턴스 메소드 접근(호출)
		ob.write();
		//--==>> 클래스 변수 a : 10
		//		 인스턴스 변수 b : 20

		// 생성된 인스턴스를 통한 클래스 변수 접근
		System.out.println("main() → 클래스 변수 a : " + ob.a);
		//--==>> main() → 클래스 변수 a : 10


		// 생성된 인스턴스를 통한 클래스 메소드 접근(호출)
		ob.print();
		//--==>> 클래스 변수 a : 10

		// ※ 클래스 변수나 클래스 메소드는
		//	  『생성된인스턴스명.변수명』
		//	  『생성된인스턴스명.메소드명()』
		//	  의 형태로 접근(호출)이 가능하지만
		//	  『클래스명.변수명』
		//	  『클래스명.메소드명()』
		//	  의 형태로 접근(호출)하는 것이 일반적이다.


		// Test096 클래스 기반 인스턴스 생성
		Test096 ob2 = new Test096();

		ob2.a = 1000;		//-- 클래스 변수 초기화
		ob2.b = 2000;		//-- 인스턴스 변수 초기화

		System.out.println("ob2 확인 --------------------------------");
		ob2.write();
		ob2.print();
		//--==>>
		/*
		클래스 변수 a : 1000
		인스턴스 변수 b : 2000
		클래스 변수 a : 1000
		*/

		System.out.println("ob 확인 ---------------------------------");
		ob.write();
		ob.print();
		//--==>>
		/*
		클래스 변수 a : 1000
		인스턴스 변수 b : 20
		클래스 변수 a : 1000
		*/
		




	}
}