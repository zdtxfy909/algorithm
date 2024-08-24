package Lv_0.day4;

public class Pizza_03 {
    public int pizza(int slice, int n) {
        //풀이1
        // int answer = 0;
        // for (int i = 1; i <= n; i++){
        //     if ((slice * (i-1)) <= n && n <= slice * i){
        //         answer = i;
        //         break;
        //     }
        // }
        // return answer;

        //풀이2
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
