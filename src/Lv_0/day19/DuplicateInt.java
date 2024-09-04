package Lv_0.day19;

public class DuplicateInt {
    public int duplicateInt(int[] array, int n) {
        //중복된 숫자 개수
        int answer = 0;
        for (int i : array) {
            //System.out.println(i);
            if(i == n) {
                answer++;
            }
        }
        return answer;
    }
}
