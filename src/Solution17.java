public class Solution17 {
    public static int solution(int[] dot) {
        if (dot[0] < 0){
            if (dot[1] > 0){
                return 2;
            }
            else return 3;
        }
        if (dot[0] > 0){
            if (dot[1] > 0){
                return 1;
            }
            else return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] box = {-1, 2};
        System.out.println(solution(box));
    }
}
