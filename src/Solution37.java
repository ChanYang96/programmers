import java.util.Arrays;

public class Solution37 {
    public static int[] solution(int[] arr, int k) {
        if (k % 2 == 1){
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
            return arr;
        }
        else
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}
