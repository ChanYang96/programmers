public class Solution50 {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if (myString.contains(pat)){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        System.out.println(solution(myString, pat));
    }
}
