package day12;

import java.util.Arrays;

public class Sort {
    public int[] solution(String my_string) {
        /*
        1. replaceAll("바꾸고싶은문자","바꿀문자")
        2. substring(시작값, 끝나는값)
        3. Integer.parseInt(문자) : 문자 -> 숫자 형변환
        4. Arrays.sort(배열) : 오름차순으로 정렬
         */
        my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(my_string.substring(i, i+1));
        }
        Arrays.sort(answer);
        return answer;
    }
}
