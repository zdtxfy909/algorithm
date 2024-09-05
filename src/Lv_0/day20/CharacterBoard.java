package Lv_0.day20;

public class CharacterBoard {
    public int[] solution(String[] keyinput, int[] board) {
        //캐릭터의 좌표
        int[] answer = {0, 0};
        for (int i = 0; i < keyinput.length; i++){
            switch (keyinput[i]) {
                case "left":
                    answer[0] -= 1;
                    break;
                case "right":
                    answer[0] += 1;
                    break;
                case "up":
                    answer[1] += 1;
                    break;
                case "down":
                    answer[1] -= 1;
                    break;
            }
            //board 크기를 벗어난 움직임은 무시
            if (Math.abs(answer[0]) > board[0] / 2) {
                //양수이면 -1 처리. 음수이면 +1로 처리하여 방향키값 무시
                answer[0] += (answer[0] > 0) ? -1 : 1;
            }
            if (Math.abs(answer[1]) > board[1] / 2) {
                answer[1] += (answer[1] > 0) ? -1 : 1;
            }
        }
        return answer;
    }
}
