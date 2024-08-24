package Lv_0.day2;

class Division {
    public int devision(int num1, int num2) {
        int answer = 0;
        boolean val = (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100);
        double div = ((double) num1 / (double) num2);

        //풀이1
        // if (val) {
        //     answer = (num1 * 1000) / num2;
        // }

        //풀이2
        if (val) {
            answer = (int) (div * 1000);
        }
        return answer;
    }
}
