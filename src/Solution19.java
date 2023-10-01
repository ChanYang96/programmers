import java.util.Arrays;

public class Solution19 {
    public static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }

    public static void main(String[] args) {
        int money = 5500;
        System.out.println(Arrays.toString(solution(money)));
    }
}
