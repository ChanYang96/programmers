public class Solution27 {
    public static int solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { result++; }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));
    }
}
