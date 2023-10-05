public class Solution28 {
    public static String solution(String my_string, int n) {
        String answer = "";
        char[] result = my_string.toCharArray();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < n; j++) {
                answer += result[i];
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        System.out.println(solution(my_string, n));
    }
}
