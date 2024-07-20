package day2;

class Irreducible {
    public int[] Irreducible(int numer1, int denom1, int numer2, int denom2) {
        boolean var = (0 < numer1 && numer1 < 1000 && 0 < denom1 && denom1 < 1000 && 0 < numer2 && numer2 < 1000 && 0 < denom2 && denom2 < 1000);

        /*
        1. 최대공약수를 활용하여 분모를 같은 크기로 맞추고, 분자도 그에 맞춘다 --> 분모와 분자를 대각선으로 곱하기
        2. 최대공약수를 구하기 위해 두 값이 분모로 나누어떨어지는 값을 찾는다. (for문 사용)
        3. 구했던 두 수를 각 최대공약수로 나눠서 값을 구한다.
        */

        //분자 구하기
        int top1 = (denom1 * numer2);
        int top2 = (denom2 * numer1);
        int totalTop = top1 + top2;

        //분모 구하기
        int bottom = denom1 * denom2;

        for(int i = bottom; i >= 1; i--) {
            //i로 분자, 분모가 다 나누어 떨어지는 수가 '최대공약수'
            if(totalTop % i == 0 && bottom % i == 0) {
                //최대공약수로 약분
                totalTop /= i;
                bottom /= i;
            }
        }

        int[] answer = {totalTop, bottom};

        return answer;
    }
}
