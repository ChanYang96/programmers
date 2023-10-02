import java.util.Arrays;

public class Solution21 {
    public static int solution(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){ count++; }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solution(array, n));
    }
}
