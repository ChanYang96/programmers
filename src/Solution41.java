import java.util.Arrays;

public class Solution41 {
    public static int solution(int a, int b, boolean flag) {
        if (flag){
            return a + b;
        }
        else return a - b;
    }

    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;
        System.out.println(solution(a, b, flag));
    }
}
