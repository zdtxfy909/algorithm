package day7;

public class Lamb {
    public int lamb(int n, int k) {
        int answer = 0;
        answer = (n * 12000) + (k * 2000) - (n/10 * 2000);
        return answer;
    }
}
