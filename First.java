import java.util.Scanner;

//패키지 위 import 밑

public class First{
	public static void main(String []ar){
//		System.out.println("First...."); //API 클래스 (String, System) //import 하지 않음 //static 때문에 new 안하고 쓸 수 있음
																					//class 이름 System을 통해 접근을 함// out은 모니터
//		
//		First f1 = new First(); //객체생성
//		First f2 = new First(); //객체생성
		
		// sc라는 변수에 주소값 --> heap. 레퍼런스 타입, array...
		Scanner sc = new Scanner(System.in); // reference type // System.in=> 키보드
		
		int num = sc.nextInt(); // 어떤기능을 하는지 옆에 영어로 설명 되있음
		
		System.out.println("TEST" + num);
	}
}

/*
	첫글자를 대문자 : 클래스
	전체 대문자 MAX : 상수 ex_ final static int MAX = 1000; (변하지 않는 값 ex_ 3,A(65), a(65+32))
	단어 + 단어 두번째 단어의 첫글자는 대문자로 씀. (black&white ==> blackWhite)
	주석 : 글자수는 최대 32자
	//스파게티 코드 ==> 에어리얼 코드
	백업은 기본 3번해 놓음 // 전에꺼 업그레이드 하라고 할 경우도 있음
*/

/*
   접근지정자
   1. private : 외부에서 절대 접근 불가능.
   2. default : 같은 패키지까지만 접근가능.
   3. protected : 외부 패키지중 상속받은 sub class까지만 접근가능
   4. public : 아무나...
*/

/*
   main method
   - 프로젝트 전체에 하나만 존재하는 함수,
   - 프로그램 시작과 끝을 담당 .
*/

//static이 class 보다 우선적으로 실행하기 위해 씀
//1. 객체가 생성되기 전에 만듬
//2. 메모리
//main은 OS에서 동작해

//Instance method : 객체당 메소드