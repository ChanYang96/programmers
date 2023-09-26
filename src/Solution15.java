import java.util.Arrays;
import java.util.HashSet;

public class Solution15 {
    public static int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        for (int i = num_list.length - 1; i >= 0; i--) {
            result[(num_list.length - 1) - i] = num_list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] box = {1, 2, 3, 4, 5};
        System.out.println(solution(box));

    }
}
