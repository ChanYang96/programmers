import java.util.Arrays;

public class Solution35 {
    public static int[] solution(double n) {
        int[] answer = new int[(int)Math.ceil(n/2)];
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(Arrays.toString(solution(n)));
    }
}