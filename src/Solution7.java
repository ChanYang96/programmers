import java.util.Scanner;

public class Solution7 {
    public static int solution(float num1, float num2) {
        float save = (num1 / num2) * 1000;
        save = (float) Math.floor(save);
        return (int)Math.round(save);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(solution(num1, num2));
    }
}
