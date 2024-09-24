package Lv_0.day20;

public class Square {
    public int square(int[][] dots) {
        //직사각형 넓이 구하기
        int x, y;
        int width = 0;
        int height = 0;

        //1. 기준좌표
        x = dots[0][0];
        y = dots[0][1];

        //2. width, height 구하기
        for (int i = 0; i < dots.length; i++){
            // x좌표 같고 y좌표 다름 => y차이로 height 구할 수 있음
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            // x좌표 다르고 y좌표 같음 => x차이로 width 구할 수 있음
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }

        return width * height;
    }
}
