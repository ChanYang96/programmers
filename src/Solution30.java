import java.util.Arrays;

public class Solution30 {
    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]){ return 1; }
        else return 2;
    }

    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }
}
