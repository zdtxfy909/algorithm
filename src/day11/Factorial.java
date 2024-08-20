package day11;

public class Factorial {
    public int factorial(int n) {
        int i = 1;
        int result = 1;
        while (n >= result) {
            if (n == result) return i;
            i++;
            result *= i;
        }
        return i-1; //주어진 n값보다 작거나 같은 팩토리얼 최댓값을 구해야해서 i-1 처리
    }
}
