package src.javaStudy;
/*=====================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(for문) 실습
  - 별찍기 실습
=======================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*

*********
 *******
  *****
   ***
    *

*/

/*
 ○ 아이디어 착안
 	
	1. for문을 몇 번 중첩시키느냐에 따라 차원을 설정할 수 있음.

	2. 현재 나타내고자 하는 별탑은 평면 즉, 2차원이므로 for문을
	   중첩시켜서 나타내고자 하였음

	3. 기존의 x축, y축은 0으로 시작이 된다.

	4. 명령프롬프트상의 x축과 y축은 0과 n(입력한 수)부터 시작된다고
	   가정아닌 가정을 해 볼 수 있다.

	5. y축을 수직상승 방향으로 볼 때 (0,n),(0,n-1),(0,n-2),...,(0,0)
	   으로 되는 셈이다.

	6. 이를 골똘이 생각해 본 결과 기존의 x,y 그래프를 정해진 점들을 통해 구한 후
	   1사분면 안에서 상하반전 시키면 원하는 결과를 얻을 수 있었다. 

	7. 그래프의 범위내에 드는 경우엔 '*' 을 출력하고 나머지 경우엔 " " 을 출력하여
	   완성하였다.
*/

public class Test062
{
	public static void main(String[] args)
	{
		int i, j;				//-- 루프변수 (y,x 축을 나타냄)

		for (i=0; i<=4; i++)	//-- y의 범위가 4 ~ 0 을 나타냄
		{
			for (j=0; j<=8; j++)	//-- x의 범위가 0 ~ 8 을 나타냄
			{
				if (i<=j && i<=-j+8)	//-- Test061과 반대되는 경우로, 본래 y>=-x+4 && y>=x-8 의 그래프 범위를 나타내지만
										//	 이를 뒤집은 형태로 y<=x && y<=-x+8 의 조건에 부합하면 원하는 역삼각형을 구할 수 있다.
				{
					System.out.print('*');	//-- 위와 같은 조건에 부합할 경우 '*' 을 출력한다.
				}
				else
				{
					System.out.print(" ");	//-- 나머지 경우에 " " 을 출력한다.
				}
			}
			System.out.println();	//-- y축 개행을 담당한다.
		}
		
	}
}

// 실행 결과

/*

*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .

*/