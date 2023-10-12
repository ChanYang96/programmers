import java.util.Arrays;

public class Solution34 {
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution(array));
    }
}