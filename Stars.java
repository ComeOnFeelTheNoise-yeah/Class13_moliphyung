1.
public class Stars {
	public static void main(String[] args) {
		for(int i = 1; i<17; i++) {
			System.out.print("*");
			if(i%4==0) System.out.println();
		}
	}
}

2.

public class Stars {
	public static void main(String[] args) {
		for (int starNum = 1; starNum<=3;starNum++) {
			for(int j = 1;j<=starNum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

3.

public class Stars {
	public static void main(String[] args) {
		String [][]starBox = new String [3][3];
		
		for(int i = 0; i < starBox.length; i++) {
			for(int j = 0; j < starBox[i].length; j++) {
				if(i+j>1) {
					starBox[i][j] = "*";
				}else {
						starBox[i][j] = " ";
				}
				System.out.print(starBox[i][j]);
			}
			System.out.println();
		}
	}
}


4.
public class Stars {
	public static void main(String[] args) {
		String [][]starBox = new String [3][5];
		
		for(int i = 0; i < starBox.length; i++) {
			for(int j = 0; j < starBox[i].length; j++) {
				
				if(i<(starBox.length)-1) { //끝을 제외한 별의 자리
					starBox[(starBox.length)/2][((starBox[i].length)/2)-1] = "*"; 
					//세로로 중앙 별과 가장 하단 가로 별들을 제외한 중앙 기준 좌측 별의 자리에 별 초기화
					
					starBox[(starBox.length)/2][((starBox[i].length)/2)+1] = "*";
					//가로 중앙 별과 가장 하단 가로 별을 제외한 중앙 기준 우측 별의 자리에 별 초기화
					
					starBox[i][(starBox[i].length)/2] ="*";
					//가로로 하단 라인의 별 제외한 세로로 중앙라인의 별 초기화
					
				}else if (i == starBox.length -1) {
					starBox[starBox.length - 1][j] = "*";
					//가로로 가장 하단 라인에 있는 별 초기화
					
				}else {
					starBox[i][j] = "\s"; //공백문자
				}
				
				System.out.print(starBox[i][j]);
			}
			System.out.println("");
		}
	}
}

5.
public class Stars {
	public static void main(String[] args) {
		String [][]starBox = new String [5][5]; //별을 집어넣을 String 배열 starBox 선언
		int cnt=1;
		int cnt2=2;
		int sRow = starBox.length; //배열 starBox의 행자리
		for(int i = 0; i < starBox.length; i++) {
			for(int j = 0; j < starBox[i].length; j++) {
				
				int sCol = starBox[i].length; //배열 starBox의 열자리
				
				if(i==(sRow-1)/2||j==(sCol-1)/2) { //배열 그림상 십자라인이라면,
					starBox[i][j] = "*";          //십자라인에 해당하는 배열에 * 초기화
				}else if((i==(sRow)/sRow&&j==sCol-cnt)|| //중앙으로부터 상우
						 (i==(sRow)/sRow+cnt2&&j==sCol-cnt)|| //중앙으로 부터 좌하
						 (i==(sRow)/sRow&&j==sCol-cnt-2)|| //중앙으로부터 좌상
						 (i==(sRow)/sRow+cnt2&&j==sCol-cnt2)//중앙으로부터 우하
						 ) {
					starBox[i][j] = "*";
				}
				
				if(starBox[i][j]==null) {//지정된 배열자리에 값이 null이라면,
					starBox[i][j] = "\s"; //공백 문자를 넣어줌.
				}
				System.out.print(starBox[i][j]);
			}
			System.out.println("");
			cnt++;
			if (cnt2<(sRow-1)/2)
				cnt2++;
		}
	}
}

6.
import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하면 별이 다이아몬드 모양으로 빛나요 \n" + "단, 홀수만 입력하세요: ");
		int starNum = sc.nextInt();
		int center = starNum / 2;

		String[][] starBox = new String[starNum][starNum]; // 별을 집어넣을 String 배열 starBox 선언
		int cnt = 1;
		
		if (starNum % 2 == 1) {
			for (int i = 0; i < starBox.length; i++) {
				
				for (int j = 0; j < starBox[i].length; j++) {

					if (i == center || j == center) { // 배열 그림상 십자라인이라면,
						starBox[i][j] = "*"; // 십자라인에 해당하는 배열에 * 초기화
					} else if(cnt<center){
						starBox[cnt][center-cnt] = "*"; //십자 기준 좌 상 별
						starBox[cnt][center+cnt] = "*"; //십자 기준 우 상 별
						starBox[center+cnt][(center-cnt)] = "*"; //십자 기준 좌 하 별
						starBox[center+cnt][(center+cnt)] = "*"; //십자 기준 우 하 별
					}

					if (starBox[i][j] == null) {// 지정된 배열자리에 값이 null이라면,
						starBox[i][j] = "\s"; // 공백 문자를 넣어줌.
					}
					System.out.print(starBox[i][j]);
				}
				System.out.println("");
				cnt++;
			}
		} else {
			System.out.println("잘못입력하셨네요.");
		}
	}
}

7.
public class Stars {
	public static void main(String[] args) {
		String [][]starBox = new String [5][5]; //별을 집어넣을 String 배열 starBox 선언
		int cnt=1;
		int cnt2=2;
		int sRow = starBox.length; //배열 starBox의 행자리
		for(int i = 0; i < starBox.length; i++) {
			for(int j = 0; j < starBox[i].length; j++) {
				
				int sCol = starBox[i].length; //배열 starBox의 열자리
				
				if(i==(sRow-1)/2||j==(sCol-1)/2) { //배열 그림상 십자라인이라면,
					starBox[i][j] = "*";          //십자라인에 해당하는 배열에 * 초기화
				}else if((i==(sRow)/sRow&&j==sCol-cnt)||
						 (i==(sRow)/sRow+cnt2&&j==sCol-cnt)) {
					starBox[i][j] = "*";
				}
				
				if(starBox[i][j]==null) {//지정된 배열자리에 값이 null이라면,
					starBox[i][j] = "\s"; //공백 문자를 넣어줌.
				}
				System.out.print(starBox[i][j]);
			}
			System.out.println("");
			cnt++;
			if (cnt2<(sRow-1)/2)
				cnt2++;
		}
	}
}

  *  
  ** 
*****
 **  
  *  