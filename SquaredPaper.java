
public class SquaredPaper {
	public static void main(String []ar){
		int foldCnt = 0;
		
		for (int i = 2; i <= 512; i*=2) {
			foldCnt += 1;
			System.out.println("접은 횟수 : "+foldCnt);
			System.out.println("사각형의 갯수 : "+ i);
		}
	}
}
