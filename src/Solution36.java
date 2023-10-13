import java.util.Arrays;

public class Solution36 {
    public static int solution(int n) {
        int savenumber = (int)Math.sqrt(n);
        if (savenumber * savenumber == n){ return 1; }
        else return 2;
    }

    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }
}
