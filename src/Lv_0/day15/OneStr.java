package Lv_0.day15;
import java.util.Arrays;

public class OneStr {
    public StringBuilder solution(String s) {
        //한 번만 등장한 문자 (toCharArray())
        StringBuilder answer = new StringBuilder();
        String[] list = s.split("");
        int cnt = 0;

        Arrays.sort(list);
        for (int i = 0; i < list.length; i++){
            cnt = 0;
            for (int j = 0; j < list.length; j++){
                if (list[i].equals(list[j])) cnt++;
            }
            if(cnt == 1) {
                answer.append(list[i]);
            }
        }

        return answer;
    }
}
