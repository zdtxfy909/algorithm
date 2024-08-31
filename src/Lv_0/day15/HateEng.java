package Lv_0.day15;

public class HateEng {
    public long HateEng(String numbers) {
        //풀이1 (replace 사용)
//         long answer = 0;
//         numbers = numbers.replace("zero", "0");
//         numbers = numbers.replace("one", "1");
//         numbers = numbers.replace("two", "2");
//         numbers = numbers.replace("three", "3");
//         numbers = numbers.replace("four", "4");
//         numbers = numbers.replace("five", "5");
//         numbers = numbers.replace("six", "6");
//         numbers = numbers.replace("seven", "7");
//         numbers = numbers.replace("eight", "8");
//         numbers = numbers.replace("nine", "9");

//         //String -> Long
//         answer = Long.parseLong(numbers);

//        return answer;
        //풀이2 (replaceAll, valueOf 사용)
        long answer = 0;
        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < list.length; i++) {
            //숫자 i를 문자열로 변환
            numbers = numbers.replaceAll(list[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}
