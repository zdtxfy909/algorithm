package Lv_0.day4;

public class Array_Avg {
    public double array_avg(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        answer /= numbers.length;
        return answer;
    }
}
