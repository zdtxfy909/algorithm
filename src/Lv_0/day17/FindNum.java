package Lv_0.day17;

public class FindNum {
    public int findNum(int num, int k) {
        //숫자 찾기
        //풀이1 (Integer.toString())
//         int answer = -1;
//         String num_str = Integer.toString(num);
//         String[] list = num_str.split("");

//         for (int i = 0; i < list.length; i++){
//             if (list[i].equals(Integer.toString(k))) {
//                 // 자릿수 리턴을 위해 +1 처리
//                 answer = i + 1;
//                 break;
//             }
//         }
//         return answer;

        //풀이2 (valueOf(), indexOf())
        /*
            1. String.valueOf()
                -> 주어진 데이터를 문자열로 변환

            2. str.indexOf(searchValue, fromIndex)
                -> 문자열 내에서 특정 문자열이나 문자 찾기
                searchValue : 찾고자 하는 문자열
                fromIndex : 검색을 시작할 인덱스, 생략할 수 있음
                searchValue가 처음 등장하는 위치의 인덱스를 반환한다.
                searchValue가 존재하지 않으면 '-1'을 반환
        */
        int answer = 0;
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}
