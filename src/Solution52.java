public class Solution52 {
    public static int solution(int order) {
        String orderString = String.valueOf(order);
        int count = 0;
        for (int i = 0; i < orderString.length(); i++) {
            if (orderString.charAt(i) == '3'){
                count++;
            }
            if (orderString.charAt(i) == '6'){
                count++;
            }
            if (orderString.charAt(i) == '9'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int order = 29423;
        System.out.println(solution(order));
    }
}
