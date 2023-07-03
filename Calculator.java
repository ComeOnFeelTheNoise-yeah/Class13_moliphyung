import java.util.Scanner; //Scanner 함수를 import

public class Calculator { 
	public static void main(String []ar){
		Scanner sc = new Scanner(System.in);
		String full = sc.nextLine(); // 3 + 7  전체를 String으로 받아온다
		
		String[] words = full.split("\\s+"); // 받아온 String을 space로 구분해 분리해준다.
		
		int num1 = Integer.parseInt(words[0]); //String을 int형으로 형변환 시켜준다. (casting)

		System.out.print(num1+" "+words[1]+" "+Integer.parseInt(words[2])+" = ");
		
		switch (words[1]) { //switch 문으로 연산자를 구분해 계산한 값을 뒤에 넣어준다.
		case "+":
			System.out.print(num1+Integer.parseInt(words[2])); //문장이 자연스럽게 이어지도록 print를 쓴다.
			break;
		case "-":
			System.out.print(num1-Integer.parseInt(words[2]));
			break;
		case "*":
			System.out.print(num1*Integer.parseInt(words[2]));
			break;
		case "/":
			System.out.print(num1/Integer.parseInt(words[2]));
			break;
		}
	}
}
/*
사칙연산 계산기

 3 + 4 -> 입력 -, *, /
 3 + 4 = 7 -> 출력
*/