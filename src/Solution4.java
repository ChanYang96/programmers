import java.util.Scanner;

public class Solution4 {
    public static int solution(int num1, int num2) {
        if (num1 == num2){
            return 1;
        }
        else return -1;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(solution(num1, num2));
    }
}
