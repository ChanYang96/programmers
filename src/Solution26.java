public class Solution26 {
    public static int solution(int slice, int n) {
        return (n + (slice - 1)) / slice;
    }

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        System.out.println(solution(slice, n));
    }
}
