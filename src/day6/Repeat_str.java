package day6;

public class Repeat_str {
    public String repeat_str(String my_string, int n) {
        String answer = "";
        //풀이1 (substring)
        // for (int i=0; i < my_string.length(); i++) {
        //     for (int j=0; j < n; j++) {
        //         answer += my_string.substring(i,i+1);
        //     }
        // }
        // return answer;

        //풀이2 (charAt)
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
