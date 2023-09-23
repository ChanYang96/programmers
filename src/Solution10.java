import java.util.Scanner;

public class Solution10 {
    public static int solution(int n, int k) {
        int bonus = n / 10;
        return (n * 12000) + ((k - bonus) * 2000);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(solution(num1, num2));
    }
}
