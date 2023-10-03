import java.util.Arrays;

public class Solution23 {
    public static String solution(String my_string) {
        my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");
        // my_string.replaceAll("[aeiou]", ""); 으로 가능
        return my_string;
    }

    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }
}
