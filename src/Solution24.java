public class Solution24 {
    public static int solution(double n) {
       return (int)Math.ceil(n / 7);
       //return (n + 6) / 7; 도 가능
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }
}
