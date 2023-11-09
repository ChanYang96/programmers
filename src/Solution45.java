import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution45 {
    public static String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //List<String> str_list = new ArrayList<>(Arrays.asList("abc", "def", "ghi"));
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(solution(str_list, ex));
    }
}
