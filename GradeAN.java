import java.util.Scanner;

public class GradeAN {

    // 필드
    private String name;
    private int[] score;
    private float avg;

    // 생성자
    public GradeAN() {
        score = new int[4];
    }
    
    public GradeAN(String n, int k, int e, int m) {
        score = new int[4];
        
        name = n;
        score[0] = k;
        score[1] = e;
        score[2] = m;
        
        getTotal();
        getAvg();
    }

    // 메소드
    public void setName(String n) {
        name = n;
    }

    public void setKor(int k) {
        score[0] = k;
    }

    public void setEng(int e) {
        score[1] = e;
    }

    public void setMat(int m) {
        score[2] = m;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return score[0];
    }

    public int getEng() {
        return score[1];
    }

    public int getMat() {
        return score[2];
    }

    public int getTotal() {
        score[3] = getKor() + getEng() + getMat();
        return score[3];
    }

    public float getAvg() {
        avg = getTotal() / 3.f;
        return avg;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        GradeAN[] ce = new GradeAN[num];

        for (int i = 0; i < num; i++) {
           
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            
            ce[i] = new GradeAN(name,kor,eng,mat); // Create a new object for each element in the array
            
            ce[i].setName(name);
            ce[i].setKor(kor);
            ce[i].setEng(eng);
            ce[i].setMat(mat);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(ce[i].getName());
            System.out.println(ce[i].getKor());
            System.out.println(ce[i].getEng());
            System.out.println(ce[i].getMat());
            System.out.println(ce[i].getTotal());
            System.out.println(ce[i].getAvg());
        }

    }
}
