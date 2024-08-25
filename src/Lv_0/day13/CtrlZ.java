package Lv_0.day13;

import java.util.Stack;

public class CtrlZ {
    public int solution(String s) {
        //컨트롤 제트 (stack 사용)
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : s.split(" ")){
            if (("Z").equals(str)){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
