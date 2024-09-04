package Lv_0.day18;

public class Sqrt {
    public int sqrt(int n) {
        //제곱근 판별하기
        int answer = 0;
        //answer = (Math.sqrt(n) - (int)Math.sqrt(n) == 0) ? 1 : 2;

        answer = (n % Math.sqrt(n) == 0) ? 1 : 2;
        return answer;
    }
}
