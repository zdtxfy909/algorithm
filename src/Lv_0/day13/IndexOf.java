package Lv_0.day13;

public class IndexOf {
    public String solution(String my_string) {
        //중복된 문자 제거
        //풀이1 (contains 사용)
//        String answer = "";
//        String[] str = my_string.split("");
//        for (int i = 0; i < str.length; i++) {
//            if (!answer.contains(str[i])){
//                answer += str[i];
//            }
//        }

        //풀이2 (indexOf, charAt 사용)
        //indexOf() : 문자(문자열)의 위치값 확인
        //charAt(인덱스번호) : 인덱스 위치의 문자 확인
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < str.length; i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
