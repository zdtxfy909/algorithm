package Lv_0.day6;

public class Cnt_odd {
    public int[] cnt_odd(int[] list) {
        int[] answer = new int[2];
        //풀이1
        // for(int i=0; i < list.length; i++) {
        //     if(list[i] % 2 == 0){
        //         answer[0]++;
        //     } else {
        //         answer[1]++;
        //     }
        // }
        // return answer;

        //풀이2 (for문만 사용)
        for(int i=0; i<list.length; i++){
            answer[list[i] % 2]++;
        }

        return answer;

    }
}
