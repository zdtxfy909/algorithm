package Lv_0.day17;

import java.util.List;
import java.util.ArrayList;

public class GetNum {
    public int[] getNum(int n, int[] numlist) {
        //n의 배수 고르기
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++){
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
