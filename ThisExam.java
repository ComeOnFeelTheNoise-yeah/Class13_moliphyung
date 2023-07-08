
	this, this()
	- this   내 자신의 객체를 접근하는 레퍼런스 변수
			 항상 인스턴스메소드의 첫번째 매개변수로 항상 존재하고 있음.
			 명시적으로 선언할 수 없다. 사용만 가능하다.
			this를 사용해야할 경우
			 1. 지역변수와 필드명이 동일할 경우 this를 사용해서 필드를 구별해줘야한다.
				 우선순위가 지역변수가 빠르기 때문에.
			
			  2. 메소드에서 자기자신의 객체를 리턴해야할 경우
			  
	- this()  현재 클래스내에 있는 생성자에서 오버로딩된 또 다른 생성자를 호출하는 방법.
			


public class ThisExam {

	private int a;
	private int b;

	public int getA() {return a; }return this.a;이지만 하나밖에없어 구분함
	public void setA(int a) {this.a = a;}
	public int getB() {return b;}
	public void setB(int b) {this.b = b; }
	
	public ThisExam () {
		this(0,0);
	}
	
	public ThisExam (int a) {
		this(a,0);
	}
	
	public ThisExam (int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		ThisExam te1 = new ThisExam();
		ThisExam te2 = new ThisExam(10);
		ThisExam te3 = new ThisExam(20,30);
	
		System.out.println(te1.getA()+ + te1.getB()); 0,0
		System.out.println(te2.getA()+ + te2.getB()); 10,0
		System.out.println(te3.getA()+ + te3.getB()); 20,30
	}

}
