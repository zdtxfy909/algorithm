package Lv_0.day5;

public class Age {
    public int age(int age) {
        int answer = 0;
        if (age > 0 && age <= 120) {
            answer = 2022 - age + 1;
        }
        return answer;
    }
}
