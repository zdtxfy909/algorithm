package day8;
import java.util.*;

public class CopyOfRange {
    public int[] solution(int[] numbers, int num1, int num2) {
        //풀이1 (copyOfRange)
        // from <= Range < to
        //return Arrays.copyOfRange(numbers, num1, num2 + 1);

        //풀이2
        int[] answer = new int[num2-num1+1];
        int k = 0;
        for (int i=num1; i <= num2; i++) {
            answer[k++] = numbers[i];
        }
        return answer;
    }
}
