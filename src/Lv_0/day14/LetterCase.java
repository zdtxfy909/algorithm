package Lv_0.day14;

public class LetterCase {
    public String solution(String my_string) {
        //대문자와 소문자
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i)) == true){
                answer += my_string.charAt(i);
            } else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
