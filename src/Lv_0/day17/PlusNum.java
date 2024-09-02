package Lv_0.day17;

public class PlusNum {
    public int solution(int n) {
        //자릿수 더하기
        //풀이1
        // int answer = 0;
        // String str = n + "";
        // String[] list = str.split("");
        // for (int i = 0; i < list.length; i++){
        //     answer += Integer.parseInt(list[i]);
        // }
        // return answer;

        //풀이2
        int answer = 0;
        while (n > 0){
            answer += n % 10;
            n = n/10;
        }

        return answer;
    }
}

