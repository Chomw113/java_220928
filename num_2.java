import java.util.Scanner;

class Grade{
    private int math = 0;
    private int science = 0;
    private int english = 0;
    private int avg =0;

    public Grade(){}
    public Grade(int math, int science, int  english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        avg = (math + science + english)/3;
        return avg;
    }

}

public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();

        Grade me = new Grade(math, science, english);

        System.out.println("평균은 " + me.average());
        sc.close();
    }
}
