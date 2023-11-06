public class Solution42 {
    public static int solution(int num, int n) {
        if (num % n == 0){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        System.out.println(solution(num, n));
    }
}
