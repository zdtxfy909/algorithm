package Lv_0.day7;

public class Protractor {
    public int protractor(int angle) {
        int answer = 0;
        if (angle == 180) {
            answer = 4;
        } else if (angle < 180 && angle > 90) {
            answer = 3;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 90 && angle > 0) {
            answer = 1;
        }
        return answer;
    }
}
