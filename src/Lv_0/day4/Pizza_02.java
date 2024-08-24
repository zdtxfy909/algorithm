package Lv_0.day4;

public class Pizza_02 {
    public int pizza(int n) {
        int piece = 6;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((piece * i) % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
