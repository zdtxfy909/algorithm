package day2;

class Multiplication {
    public int[] multiplication(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
