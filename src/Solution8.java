import java.util.Scanner;

public class Solution8 {
    public static int solution(int angle) {
        if (0 < angle && angle < 90){ return 1; }
        if (angle == 90){ return 2; }
        if (90 < angle && angle < 180){ return 3; }
        if (angle == 180){ return 4; }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(solution(age));
    }
}
