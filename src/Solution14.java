import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Solution14 {
    public static int solution(String[] s1, String[] s2) {
        HashSet<String> set1 = new HashSet(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet(Arrays.asList(s2));
        set1.retainAll(set2);
        return set1.size();
    }
    public static void main(String[] args) {
        String[] strbox1 = {"a", "b", "c"};
        String[] strbox2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(strbox1, strbox2));

    }
}
