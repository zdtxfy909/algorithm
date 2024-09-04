package Lv_0.day19;

public class Equals7 {
    public int equals7(int[] array) {
        //7의 개수
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            //int[] -> String으로 변환
            String str = Integer.toString(array[i]);
            String[] arr = str.split("");

            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals("7")) answer++;
            }
        }
        return answer;
    }
}
