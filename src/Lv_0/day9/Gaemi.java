package Lv_0.day9;

public class Gaemi {
    public int gaemi(int hp) {
        int answer = 0;

        answer = hp / 5 + hp % 5 / 3 + hp % 5 % 3;

        return answer;
    }
}
