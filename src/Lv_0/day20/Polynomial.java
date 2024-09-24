package Lv_0.day20;

public class Polynomial {
    public String solution(String polynomial) {
        //다항식 더하기
        String answer = "";

        String[] strs = polynomial.split(" ");

        //x값과 상수값 따로 저장
        int xNum = 0;
        int num = 0;

        for (int i = 0; i < strs.length; i++) {
            if(strs[i].contains("x")) { //x가 포함된 경우
                if (strs[i].equals("x")) { //"x" 단독인 경우
                    xNum += 1;
                } else { //"3x"와 같은 경우 계수만 추출
                    xNum += Integer.parseInt(strs[i].substring(0, strs[i].length() - 1));
                }
            } else if(!strs[i].equals("+")){ //상수항일 때("+"가 아닌 경우)
                num += Integer.parseInt(strs[i]);
            }
        }

        //결과 조합
        if (xNum > 0) {
            if (xNum == 1){
                answer += "x"; //1x는 "x"로 출력
            } else {
                answer += xNum + "x";
            }
        }

        if (num > 0) {
            if (!answer.isEmpty()) {
                answer += " + "; //x항이 있으면 "+" 추가
            }
            answer += num;
        }

        return answer;

        //풀이2
//         int xCount = 0;
//         int num = 0;

//         for (String s : polynomial.split(" ")) {
//             if (s.contains("x")) {
//                 xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
//             } else if (!s.equals("+")) {
//                 num += Integer.parseInt(s);
//             }
//         }
//         return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");

    }
}
