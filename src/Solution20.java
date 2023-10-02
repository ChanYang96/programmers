import java.util.Arrays;

public class Solution20 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0){ answer[0]++; }
            if (num_list[i] % 2 == 1){ answer[1]++; }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
