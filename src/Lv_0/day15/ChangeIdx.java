package Lv_0.day15;

public class ChangeIdx {
    public String solution(String my_string, int num1, int num2) {
        //인덱스 바꾸기
        String answer = "";
        String[] list = new String[my_string.length()];
        for (int i = 0; i < list.length; i++){
            list[i] = my_string.substring(i, i+1);
        }
        String temp = "";
        temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
        for (int j = 0; j < list.length; j++){
            answer += list[j];
        }
        return answer;
    }
}
