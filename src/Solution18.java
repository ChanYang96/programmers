public class Solution18 {
    public static int solution(int n) {
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 930211;
        System.out.println(solution(number));
    }
}
