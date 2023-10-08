public class Solution29 {
    public static int solution(int[] array, int height) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) { result++; }
        }
        return result;
    }

    public static void main(String[] args) {
        int height = 167;
        int[] array = {149, 180, 192, 170};
        System.out.println(solution(array, height));
    }
}
