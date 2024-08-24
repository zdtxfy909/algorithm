package Lv_0.day9;

import java.util.HashMap;
import java.util.Map;

public class Rsp {
    public String solution(String rsp) {
        //풀이1 (split 사용)
        // String answer = "";
        // for (String s : rsp.split("")) {
        //     if (s.equals("2")) {
        //         answer += "0";
        //     } else if (s.equals("0")) {
        //         answer += "5";
        //     } else {
        //         answer += "2";
        //     }
        // }
        // return answer;

        //풀이2 (HashMap 사용)
//         Map<String, String> winNumbers = new HashMap<>();
//         winNumbers.put("2", "0");
//         winNumbers.put("0", "5");
//         winNumbers.put("5", "2");

//         StringBuilder answer = new StringBuilder();

//         for (int i = 0; i < rsp.length(); i++) {
//             answer.append(winNumbers.get(rsp.substring(i, i+1)));
//         }

//         return answer.toString();

        //풀이3 (toCharArray 사용)
        char[] cRsp = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i < cRsp.length; i++) {
            switch(cRsp[i]) {
                case '0' :
                    answer.append("5");
                    break;
                case '2' :
                    answer.append("0");
                    break;
                case '5' :
                    answer.append("2");
                    break;
            }
        }
        return answer.toString();

    }

}
