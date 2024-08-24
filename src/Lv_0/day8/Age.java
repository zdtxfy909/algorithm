package Lv_0.day8;

public class Age {
    public String age(int age) {
        String answer = "";
        String age962 = "abcdefghij";
        //age를 String으로 형변환하고 split을 이용해서 ageArr 배열에 원소로 추가한다
        /* 데이터타입.valueOf 메소드
        1. String.valueOf(정수나 실수) : 정수나 실수를 문자열로 변환
        2. Integer.valueOf(문자열) : 문자열을 정수로 변환
        3. Double.valueOf(문자열) : 문자열을 실수로 변환
         */
        String[] ageArr = String.valueOf(age).split("");
        //for문을 통해 ageArr 배열을 순회하며 각 자릿수의 값을 가져온 후, 정수로 변환하고
        //age962 문자열의 charAt을 통해 정수로 형변환된 인덱스에 해당한 값을 가져온다.
        /* charAt 메소드
        문자열에서 특정 위치에 있는 문자를 반환한다. 각 문자는 인덱스로 접근할 수 있고, 인덱스는 0부터 시작한다.
         */
        for (int i=0; i < ageArr.length; i++) {
            answer += age962.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}
