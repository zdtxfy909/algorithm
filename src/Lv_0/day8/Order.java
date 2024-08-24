package Lv_0.day8;

public class Order {
    public int[] order(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i < answer.length; i++) {
            int order = 1;
            for(int j=0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    order++;
                }
            }
            answer[i] = order;
        }
        return answer;
    }
}
