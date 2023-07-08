
/*
 	오버로딩 (다형성)
 	 동일한 함수명으로 여러개의 함수를 제공해서 사용하게 해주는 기술.
 	 매개변수의 타입, 또는 매개변수의 갯수로 구별이 가능해야한다.
 	 목적이 다른 함수끼리는 암묵적으로 오버로딩 금지.
 	 리턴타입이 다를경우 -> 오버로딩이 아님. // public char getA() {

 */

public class ClassOverloading {

	private int a;
	private int b;

	public ClassOverloading() {
		System.out.println("Default1");
	}
	
	public ClassOverloading(int aa, int bb) {
		System.out.println("Default2");
		a = aa;
		b = bb;
	}

	public int getA() {
		return a;
	}
	public int getA(int aa, int bb) { //매개변수 3개
		return a;
	}

	public int getA(int aa) {
		return a+aa;
	}

	public int getB() { //매개변수 1개 (this)
		return b;
	}

	public static void main(String[] args) {

		ClassOverloading oe1 = new ClassOverloading();

		System.out.println(oe1.getA());
		System.out.println(oe1.getB());

		ClassOverloading oe2 = new ClassOverloading(10,20);

		System.out.println(oe2.getA());
		System.out.println(oe2.getB());

	}

}
