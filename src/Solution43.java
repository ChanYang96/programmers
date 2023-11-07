import java.util.Arrays;

public class Solution43 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - n) + 1];
        int count = 0;
        for (int i = n-1; i < num_list.length; i++) {
            answer[count] = num_list[i];
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
