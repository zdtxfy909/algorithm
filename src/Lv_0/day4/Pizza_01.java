package Lv_0.day4;

public class Pizza_01 {
    public int pizza(int n) {
        //풀이1
//         int piece = 7;
//         int answer = 0;

//         for (int i = 1; i <= n; i++) {
//             if ((piece * (i-1)) < n && n <= (piece * i)) {
//                 answer = i;
//             }
//         }

        //풀이2
        int piece = 7;
        int answer = 0;

        answer = (n%piece == 0) ? n/piece : (n/piece) + 1;

        return answer;
    }
}
