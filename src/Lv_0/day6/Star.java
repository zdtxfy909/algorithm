package Lv_0.day6;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //풀이1
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //        System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //풀이2 (문자열 반복 메소드 repeat 사용)
        //String 문자열을 파라미터의 주어진 횟수만큼 반복 (자바11이상)
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
