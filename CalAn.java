import java.util.Scanner;

public class CalAn {
	//필드
	private int num1;
	private int num2;
	private String op;
	
	//생성자
	public CalAn() {
		System.out.println("사칙연산계산기");
	}
	
	public void setNum1(int num) {
		num1 = num;
	}
	
	public void setNum2(int num) {
		num2 = num;
	}
	
	public void setOp(String o) {
		op = o;
	}
	
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public String getOp() {
		return op;
	}
	
	public int plus() {
		return num1 + num2;
	}
	
	
	//메소드
	
	public static void main(String[] args) {
		
		CalAn calc = new CalAn();
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		String op = sc.next();
		int n2 = sc.nextInt();
		
		calc.setNum1(n1);
		calc.setNum2(n2);
		calc.setOp(op);
		
		System.out.println(calc.getNum1()+" "+calc.getOp()+" "+calc.getNum2()+ " = "+calc.plus());
	}
}
