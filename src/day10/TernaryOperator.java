package day10;

public class TernaryOperator {
    public int solution(int[] dot) {
        //풀이1
        // int answer = 0;
        // if (dot[0] > 0 && dot[1] > 0) {
        //     return answer = 1;
        // } else if (dot[0] > 0 && dot[1] < 0) {
        //     return answer = 4;
        // } else if (dot[0] < 0 && dot[1] > 0) {
        //     return answer = 2;
        // } else {
        //     return answer = 3;
        // }

        //풀이2
        int answer = 0;
        int xElement = dot[0];
        int yElement = dot[1];

        if (xElement > 0) {
            return answer = (yElement > 0) ? 1 : 4;
        } else {
            return answer = (yElement > 0) ? 2 : 3;
        }
    }
}
