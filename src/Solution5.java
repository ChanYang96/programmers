import java.util.Scanner;

public class Solution5 {
    public static int solution(int age) {
        return (2022 - age) + 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(solution(age));
    }
}
