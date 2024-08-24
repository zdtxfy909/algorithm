package Lv_0.day12;

public class Solution {
    public int solution(String myString) {
        //숨어있는 숫자의 덧셈(1)
        int answer = 0;
        for(char c : myString.toCharArray()) {
            if(c >= '1' && c <= '9'){
                answer += c - '0'; //문자 c를 숫자값으로 변환
                //문자 '0'의 아스키코드 값 48
                /*
                c < '10' 이 아니고 c <= '9' 인 이유
                '10'은 문자가 아닌 문자 두개가 합쳐진 문자열
                 */
            }
        }
        return answer;
    }
}
