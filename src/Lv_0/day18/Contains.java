package Lv_0.day18;

public class Contains {
    public int contains(String str1, String str2) {
        //문자열안에 문자열
        int answer = 0;
        answer = str1.contains(str2) ? 1 : 2;

        return answer;
    }
}
