package Lv_0.day16;

public class CalStr {
    public int solution(String myString) {
        //문자열 계산하기
        String[] list = myString.split(" ");
        int answer = Integer.parseInt(list[0]);

        for (int i = 1; i < list.length; i+=2) {
            //System.out.println(list[i]);
            if(list[i].equals("+")){
                answer += Integer.parseInt(list[i+1]);
            } else {
                answer -= Integer.parseInt(list[i+1]);
            }
        }
        return answer;
    }
}
