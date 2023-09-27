import java.util.Scanner;

public class Solution16 {
    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.next();
        String my_string = "abcdef";
        System.out.println(solution(my_string, letter));
    }
}
