package Lv_0.day14;

public class ThreeSixNine {
    public int solution(int order) {
        //369게임
        //풀이1 (int -> String -> String[])
        int answer = 0;
        String str = Integer.toString(order);
        String[] list = str.split("");
        for (int i = 0; i < list.length; i++) {
            if(list[i].equals("3") || list[i].equals("6") || list[i].equals("9")) {
                answer++;
            }
        }
        return answer;

        //풀이2 (int -> String -> char)
//        int answer = 0;
//        String str = order + "";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == '3' || c == '6' || c == '9'){
//                answer++;
//            }
//        }
//        return answer;
    }
}
