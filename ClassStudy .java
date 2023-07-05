/*
 클래스의 구성요소
 1. field
 	- 객체 생성 후 지속적으로 사용하고자 하는 데이터.
 	- 접근지정자 주로 private으로 지정합니다.
 
 2. method
 	- 인스턴스메소드 instance method : 객체를 생성한 후 사용할 수 있는 메소드
 	(이름은 각자있어야...)
 		- 매개변수의 첫번재 매개변수 this를 가지고 있다.
 		- 의미상 객체당 하나씩 가지고 있는 의미가 성립
 		
 	- 스태틱메소드	static method : 겍체 생성유무와 상관없이 사용할 수 있는 메소드
 	(달력 하나만 있어도... -> 메모리를 절약하는)
 		- this를 가지고 있다.
 		- 갑은 타입의 모든 객체가 공유하는 의미.

 	- 외부와 내부를 연결시켜주는 역할.
 	- 접근 지정자를 주로 public으로 지정
 	- 오버로딩이 가능하다.
 	
 3. constructor(실행될 떄 딱 한번만 호출 됌)
 	- 객체생성시 자동 호출되어지는 함수
 	- 생성자함수를 명시적으로 만들지 않을 경우 디폴트생성자를 제공합니다.
 	
 	- 기능 : 디폴트기능 -> 객체 등록.
 			개발자 -> 객체생성시 필드초기화
 	- 주로 public으로 지정 (private 설정시 절대로 외부에서 접근 불가-->static=싱글톤패턴 알고리즘기법)
 	- 오버로딩이 가능
 */

public class ClassStudy {
	
	// 생성자를 제공하지 않을경우 내부적으로 제공하는 생성자 : 디폴트생서이자
	// 명시적으로 생성자를 만들경우 디폴트 생성자는 제공되지 않음.
	// 리턴타입을 존재하지 않고, 함수명도 클래ㅁ스명과 동일해야함.
	
	//필드
	private int a;
	
	public ClassStudy() {
		System.out.println("디폴트생성자");
	}
	
	public int getA() { //getter
		return a;
	}
	
	public void setA(int aa) { // setter : set+필드명(약속)
		a = aa;
	}
	
	public static void main(String[] args) { //외부
		
		ClassStudy ce1 = new ClassStudy(); // 생성자호출
		ClassStudy ce2 = new ClassStudy(); // 생성자호출
		
		System.out.println(ce1.a);
		System.out.println(ce2.a); //main이 Class안에 있기 때문에 가능한 일
		
		ce1.a = 100;
		ce2.a = 200;
		
		ce1.setA(100);
		ce2.setA(200);
		
		System.out.println(ce1.getA());
		System.out.println(ce2.getA()); //main이 Class안에 있기 때문에 가능한 일

		
	}
}
