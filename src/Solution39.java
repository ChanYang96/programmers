import java.util.Arrays;
public class Solution39 {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[(end_num - start_num) + 1];
        int count = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[count] = i;
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
}