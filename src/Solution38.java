public class Solution38 {
    public static int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        return n; // 다른 방법 : n << t
    }

    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        System.out.println(solution(n, t));
    }
}
