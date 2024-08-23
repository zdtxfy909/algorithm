package day12;

public class vowels {
    public String solution(String my_string){
        //풀이1
//        String answer = my_string;
//        String[] vowels = {"a", "e", "i", "o", "u"};
//        for (String v : vowels){
//            answer = answer.replaceAll(v, "");
//        }

        //풀이2
        String answer = "";
        //answer = my_string.replaceAll("[a,e,i,o,u]", "");
        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
