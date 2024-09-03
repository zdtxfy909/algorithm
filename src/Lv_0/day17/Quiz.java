package Lv_0.day17;

public class Quiz {
    public String[] quiz(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] list = new String[quiz.length];
        int hap = 0;

        for (int i = 0; i < quiz.length; i++) {
            //System.out.println(quiz[i]);
            list = quiz[i].split(" ");
            if (list[1].equals("+")) {
                hap = Integer.parseInt(list[0]) + Integer.parseInt(list[2]);
                //System.out.println(hap);
                if (hap == Integer.parseInt(list[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                hap = Integer.parseInt(list[0]) - Integer.parseInt(list[2]);
                //System.out.println(hap);
                if (hap == Integer.parseInt(list[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
