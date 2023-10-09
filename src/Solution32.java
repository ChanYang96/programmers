public class Solution32 {
    public static int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))){//i 번째가 숫자인지 묻는 것
                sum += Character.getNumericValue(my_string.charAt(i)); // 맞다면 더함
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
