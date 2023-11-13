public class Solution48 {
    public static String solution(String myString) {
        String newString = "";
        for (int i = 0; i < myString.length(); i++) {
            if ((int)myString.charAt(i) <= 90){
                newString += (char)((int)myString.charAt(i) + 32);
            }
            if ((int)myString.charAt(i) >= 97){
                newString += (char)((int)myString.charAt(i) - 32);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String myString = "cccCCC";
        System.out.println(solution(myString));
    }
}
