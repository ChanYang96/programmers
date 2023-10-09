import java.util.Arrays;

public class Solution31 {
    public static int solution(String str1, String str2) {
        if (str1.contains(str2)) { return 1; }
        else return 2;
    }

    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1, str2));
    }
}
