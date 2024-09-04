package Lv_0.day18;
import java.util.*;

public class Sort {
    public String sort(String my_string) {
        //문자열 정렬하기
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        for (String ans : arr) {
            answer += ans;
        }
        return answer;
    }
}
