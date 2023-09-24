import java.util.Arrays;
import java.util.Scanner;

public class Solution12 {
    public static int[] solution(String[] strlist) {
        int[] savenumber = new int[strlist.length];
        for (int i = 0; i < savenumber.length; i++) {
            savenumber[i] = strlist[i].length();
        }
        return savenumber;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(strlist.length);
        System.out.println(Arrays.toString(solution(strlist)));
    }
}
