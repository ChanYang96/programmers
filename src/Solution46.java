public class Solution46 {
    public static int solution(String myString, String pat) {
        String reString = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A'){
                reString += "B";
            }
            if (myString.charAt(i) == 'B'){
                reString += "A";
            }
        }
        if (reString.contains(pat)){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        System.out.println(solution(myString, pat));
    }
}
