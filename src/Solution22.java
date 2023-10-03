import java.util.Arrays;

public class Solution22 {
    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 4, 5};
        System.out.println(solution(numbers));
    }
}
