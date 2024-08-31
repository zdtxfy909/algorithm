package Lv_0.day15;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sqrt {
    public int[] solution(int n) {
        //약수 구하기 ( Math.sqrt() 사용 / list -> arr / Array.sort() )
        List<Integer> divisors = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n); //제곱근 구하기
        //System.out.println(sqrt);
        for (int i = 1; i <= sqrt; i++) {
            if(n % i == 0){
                divisors.add(i); //i는 n의 약수

                if(i != n / i) {
                    //대칭 찾기, i와 n/i가 다른 경우에만 추가
                    divisors.add(n / i);
                }
            }
        }

        //list를 배열로 변환
        int[] answer = new int[divisors.size()];
        for(int j = 0; j < divisors.size(); j++){
            answer[j] = divisors.get(j);
        }

        //배열을 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}
