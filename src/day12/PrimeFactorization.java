package day12;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorization {
    public int[] solution(int n) {
    /* 소인수분해
        for문을 이용해서 i로 나눠준다
        몫이 2 이상인 경우도 있기 때문에 나머지가 0이 아닐 때까지 나눠준다
    */
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
            list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}
