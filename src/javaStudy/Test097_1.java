package src.javaStudy;
/*==========================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
============================================================*/

// ○ 실습 문제
// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//	  - 속성만 존재하는 클래스로 설계할 것~!!!!
// 2. Sungjuk 클래스
//	  - 인원 수를 입력받아, 입력받은 인원 수 만큼
//	    이름, 국어점수, 영어점수, 수학점수를 입력받고
//	    총점과 평균을 산출하는 클래스로 설계할 것~!!!!
//	    * 속성 : 인원수, Record 형태의 배열
//	    * 기능 : 인원수 입력, 상세 데이터 입력(이,국,영,수), 총점/평균 연산, 결과 출력
// 3. Test097 클래스
//	  - main() 메소드가 존재하는 외부 클래스로 설계할 것~!!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3
// 1번째 학생의 이름 입력 : 이현지
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70
// 2번째 학생의 이름 입력 : 박혜민
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62
// 1번째 학생의 이름 입력 : 김동현
// 국어 점수 : 98
// 영어 점수 : 88
// 수학 점수 : 78

// 이현지  90  80  70   240  xx.xx  2
// 박혜민  82  72  62   xxx  xx.xx  3
// 김동현  98  88  78   xxx  xx.xx  1

// 계속하려면 아무 키나 누르세요...


public class Test097_1
{

	public static void main(String[] args)
	{
		Sungjuk_1 sj = new Sungjuk_1();

		//Record_1 rc = new Record_1();

		sj.input();

		sj.detail();

		sj.calculate();

		sj.print();
	}
}

// 실행 결과

/*
인원 수 입력(1~100) : 102
인원 수 입력(1~100) : 101
인원 수 입력(1~100) : -20
인원 수 입력(1~100) : 4
1번째 학생의 이름 입력 : aaa
국어 점수 : 45
영어 점수 : 45
수학 점수 : 45
2번째 학생의 이름 입력 : bbb
국어 점수 : 78
영어 점수 : 78
수학 점수 : 78
3번째 학생의 이름 입력 : ccc
국어 점수 : 12
영어 점수 : 12
수학 점수 : 12
4번째 학생의 이름 입력 : ddd
국어 점수 : 69
영어 점수 : 68
수학 점수 : 67
aaa  45  45  45 135 45.00 3
bbb  78  78  78 234 78.00 1
ccc  12  12  12  36 12.00 4
ddd  69  68  67 204 68.00 2
계속하려면 아무 키나 누르십시오 . . .
*/