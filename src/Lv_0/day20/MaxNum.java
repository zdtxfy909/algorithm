package Lv_0.day20;
import java.util.*;

public class MaxNum {
    public int solution(int[] numbers) {
        //최댓값 만들기(2)
        //풀이1
        // int max = Integer.MIN_VALUE; // 음수일 수도 있으므로 Integer.MIN_VALUE로 초기화
        // for (int i = 0; i < numbers.length - 1; i++) {
        //     for (int j = i + 1; j < numbers.length; j++) {
        //         //j는 i+1부터 시작하면 동일한 인덱스의 값을 곱하지 않음
        //         if (numbers[i] * numbers[j] > max) {
        //             max = numbers[i] * numbers[j];
        //             System.out.println(max);
        //         }
        //     }
        // }
        // return max;

        //풀이2
        Arrays.sort(numbers);
        int length = numbers.length;
        int minusMax = numbers[0] * numbers[1];
        int plusMax = numbers[length - 1] * numbers[length -2];
        int answer = 0;
        answer = (minusMax > plusMax) ? minusMax : plusMax;

        return answer;
    }
}
