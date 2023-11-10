public class Solution47 {
    public static int solution(int hp) {
        int ant = 0;
        while (hp != 0){
            if(hp >= 5){
                ant += hp/5;
                hp = hp %5;
            }
            else if(hp >= 3){
                ant += hp/3;
                hp = hp%3;
            }
            else if(hp >= 1){
                ant += hp/1;
                hp = hp %1;
            }
        }
        return ant; //return hp / 5 + (hp % 5 / 3) + hp % 5 % 3; 도 가능
    }

    public static void main(String[] args) {
        int hp = 24;
        System.out.println(solution(hp));
    }
}
