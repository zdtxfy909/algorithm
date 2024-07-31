package day5;

public class Reverse_Arr {
    public int[] reverse_arr(int[] num_list) {
        int[] answer = new int[num_list.length];
        //풀이1
        // int startIdx = 0;
        // for(int i = num_list.length-1; i>=0; i--){
        //     answer[startIdx] = num_list[i];
        //     startIdx++;
        // }
        // return answer;

        //풀이2 (추가 변수 만들지 않고 직접 배열에 넣기)
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
            //answer 배열의 마지막 위치부터 num_list 배열의 첫번째 값을 담아준다
        }
        return answer;
    }
}
