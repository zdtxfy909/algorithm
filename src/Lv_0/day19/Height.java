package Lv_0.day19;
import java.util.*;

public class Height {
    public int height(int[] array, int height) {
        //머쓱이보다 키 큰 사람
        int answer = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(height < array[i]) {
                //System.out.println("height보다 큰 키 : " + array[i]);
                answer++;
            }
        }
        return answer;
    }
}
