package Lv_0.day14;

public class Solution {
    public String solution(String cipher, int code) {
        //암호해독
        //풀이1 (split 사용)
//        String answer = "";
//        String[] list = cipher.split("");
//        for(int i = code; i <= cipher.length(); i += code) {
//            answer += list[i-1];
//        }
//        return answer;

        //풀이2 (substring 사용)
        String answer = "";
        for(int i = code; i <= cipher.length(); i+= code) {
            answer += cipher.substring(i-1, i);
        }
        return answer;
    }
}
