package Lv_0.day10;

public class Ball {
    public int ball(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        while(k > 0) {
            answer = numbers[i%numbers.length]; //인덱스가 numbers.length 보다 커지면 i % numbers.length 값이 인덱스가 됨
            i+=2; //공을 던지면 인덱스는 2씩 늘어남
            k--;
        }
        return answer;
    }
}
