package day5;

public class Discount {
    public int discount(int price) {
        //풀이1
        // int answer = 0;
        // if (price < 100000) {
        //     answer = price;
        // }
        // if (price >= 100000 && price < 300000) {
        //     answer = (int)(price * 0.95);
        // }
        // if (price >= 300000 && price < 500000) {
        //     answer = (int)(price * 0.9);
        // }
        // if (price >= 500000 && price <= 1000000) {
        //     answer = (int)(price * 0.8);
        // }
        // return answer;

        //풀이2
        int answer = 0;
        if (price >= 500000) return (int)(price*0.8);
        if (price >= 300000) return (int)(price*0.9);
        if (price >= 100000) return (int)(price*0.95);

        return price;
    }
}
