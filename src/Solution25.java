public class Solution25 {
    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution(my_string));
    }
}
