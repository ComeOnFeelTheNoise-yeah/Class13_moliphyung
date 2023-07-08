
public class ThisExam01 {
	
	private int a;
	private int b;
	
	public ThisExam01() {

	}
	public static void disp() {
		
		ThisExam01 te1 = new ThisExam01();
		
		System.out.println(te1.a+" "+te1.b);
	}

	public static void main(String[] args) {
		
		ThisExam01.disp();
	}

}
