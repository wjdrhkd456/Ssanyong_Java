package src.javaStudy;
/*=================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
===================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위 2:바위 3:보 중 입력(1~3) : 4
// 1:가위 2:바위 3:보 중 입력(1~3) : -2
// 1:가위 2:바위 3:보 중 입력(1~3) : 2
// - 유저	: 바위
// - 컴퓨터 : 보
// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나 누르세요...

// 미완성

public class Test098_1
{
	public static void main(String[] args)
	{
		String res=" ";

		RpsGame rp = new RpsGame();

		//rp.set();

		//res = rp.game();

		rp.print(res);
	}
}