package Lv_0.day19;

public class Substring {
    public String[] substring(String my_str, int n) {
        //잘라서 배열로 저장하기
        //풀이1
//         List<String> list = new ArrayList<>();

//         int idx = 0;
//         while (idx < my_str.length()) {
//             //문자열의 남은 길이가 n보다 크거나 같은지 확인
//             if (idx + n < my_str.length()) {
//                 //my_str을 n만큼 잘라서 list에 추가
//                 list.add(my_str.substring(idx, idx + n));
//             } else {
//                 //남은 문자열을 전부 list에 추가
//                 list.add(my_str.substring(idx));
//             }
//             //인덱스를 n만큼 이동시키기
//             idx += n;
//         }

//         String[] answer = new String[list.size()];
//         for(int i = 0; i < list.size(); i++){
//             answer[i] = list.get(i);
//         }

//         return answer;

        //풀이2
        //answer의 배열 갯수 구하기
        int cnt = 0;
        if (my_str.length() % n == 0) {
            cnt = my_str.length()  / n;
        } else {
            cnt = my_str.length()  / n + 1;
        }

        String[] answer = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            int start = n * i;
            int end = (start + n < my_str.length()) ? start + n : my_str.length(); //잘라야하는 문자 개수가 length 초과하면 length까지만 자르기
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
