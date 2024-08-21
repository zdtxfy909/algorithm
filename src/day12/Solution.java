package day12;

public class Solution {
    public int solution(String myString) {
        int answer = 0;
        for(char c : myString.toCharArray()) {
            if(c >= '1' && c <= '9'){
                answer += c - '0'; //문자 c를 숫자값으로 변환
                //문자 '0'의 아스키코드 값 48
            }
        }
        return answer;
    }
}
