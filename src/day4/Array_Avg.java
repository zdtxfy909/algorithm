package day4;

public class Array_Avg {
    public double array_avg(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer /= numbers.length;
        return answer;
    }
}
