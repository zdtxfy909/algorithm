package Lv_0.day16;

public class MaxNum {
    public int[] maxNum(int[] array) {
        //가장 큰 수 찾기
        int[] answer = new int[2];
        int maxNum = 0;
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                idx = i;
            }
        }

        answer[0] = maxNum;
        answer[1] = idx;

        return answer;
    }
}
