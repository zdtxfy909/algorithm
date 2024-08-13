package day9;

public class Balls_factorial {
    public int combination (int b, int s) {
        if (b == s || s == 0) {
            return 1;
        } else {
            return combination(b-1, s-1) + combination(b-1, s);
        }
    }
    public int solution(int balls, int share) {

        return combination(balls, share);
    }
}
