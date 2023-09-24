import java.util.Arrays;
import java.util.Scanner;

public class Solution13 {
    public static int solution(String strlist) {
        return strlist.length() * 2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strlist = "happy birthday!";
        System.out.println(solution(strlist));
    }
}
