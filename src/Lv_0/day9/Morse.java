package Lv_0.day9;
import java.util.HashMap;
import java.util.Map;

public class Morse {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> alpMap = new HashMap<>() {
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };

        String[] letterArr = letter.split(" ");
        for (String arr : letterArr) {
            answer += alpMap.get(arr);
        }

        return answer;
    }

}
