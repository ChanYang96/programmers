public class Solution33 {
    public static int solution(int price) {
        if (price >= 100000 && price <= 299999){ return price - (int)(Math.round(price * 0.05)); }
        if (price >= 300000 && price <= 499999){ return price - (int)(Math.round(price * 0.1)); }
        if (price >= 500000){ return price - (int)(Math.round(price * 0.2)); }
        return price;
    }

    public static void main(String[] args) {
        int price = 580000;
        System.out.println(solution(price));
    }
}
