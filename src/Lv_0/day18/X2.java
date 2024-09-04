package Lv_0.day18;

public class X2 {
    public int x2(int n, int t) {
        //세균 증식
        // 한시간에 두배씩 증가 7 -> 14 -> 28 -> 56
        // answer -> answer*2 -> answer*2
        int answer = n;
        for (int i = 0; i < t; i++){
            answer *= 2;
        }

        return answer;
    }
}
