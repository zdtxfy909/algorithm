package day10;

public class Arr_lotation {
    public int[] arr_lotaion(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch(direction) {
            case "right":
                answer[0] = numbers[numbers.length - 1];
                for (int i = 1; i <= answer.length - 1; i++) {
                    answer[i] = numbers[i - 1];
                }
                break;
            case "left":
                answer[numbers.length - 1] = numbers[0];
                for (int i = 1; i <= answer.length - 1; i++) {
                    answer[i - 1] = numbers[i];
                }
                break;
        }
        return answer;
    }
}
