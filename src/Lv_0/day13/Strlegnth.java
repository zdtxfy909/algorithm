package Lv_0.day13;

public class Strlegnth {
    public int[] solution(String[] strlist) {
        //배열 원소의 길이
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
