package day7;

public class Sum_even {
    public int even(int n) {
        int answer = 0;
        //풀이1
        // for (int i=1; i <= n; i++) {
        //     if (i%2 == 0) {
        //         answer += i;
        //     }
        // }

        //풀이2
        for(int i=2; i<=n; i+=2){
            answer+=i;
        }
        return answer;
    }
}
