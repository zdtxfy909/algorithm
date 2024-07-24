package day3;

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public int mode(int[] array) {
        //풀이1
//         int[] index = new int[1001]; //인덱스의 카운터
//         int max = Integer.MIN_VALUE; //최대값을 저장하기 위한 변수. 초기값은 정수형의 최소값으로 지정
//         int answer = 0; //최빈값을 담는 그릇

//         for (int i = 0; i < array.length; i++) {
//             index[array[i]]++; //최빈값 count
//         }

//         for (int i = 0; i < index.length; i++) {
//             if (index[i] > max) {
//                 max = index[i]; //MAX
//                 answer = i; //최빈값 MODE
//             }else if (max == index[i]) {
//                 answer = -1;
//             }
//         }

//         return answer;

        //풀이2
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
    }
}
