package day11;

public class CompositeNum {
    public int compositeNum(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                cnt += (i % j == 0) ? 1 : 0;
            }
            answer += (cnt >= 3) ? 1 : 0;
        }
        return answer;
    }
}
