package Lv_0.day6;

public class Reverse_Str {
    public String solution(String my_string) {
        //풀이1 (substring)
//         String answer = "";
//         for (int i = my_string.length() - 1; i >= 0; i--) {
//             answer += my_string.substring(i, i+1);
//         }
//
//         return answer;

        //풀이2 (StringBuilder)
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
