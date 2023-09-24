import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] savenumber = new int[(num2 - num1) + 1];
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            savenumber[count] = numbers[i];
            count++;
        }
        return savenumber;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }
}
