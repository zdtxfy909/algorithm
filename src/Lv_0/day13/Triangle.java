package Lv_0.day13;
import java.util.Arrays;

public class Triangle {
    public int solution(int[] sides) {
        //삼각형의 완성조건(1)
        int answer = 0;
        Arrays.sort(sides);
        if (sides[2] >= (sides[0] + sides[1])) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}
