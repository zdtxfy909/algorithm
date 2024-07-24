package day3;

import java.util.Arrays;

class Mid {
    public int mid(int[] array) {
        //풀이1
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = i+1; j < array.length; j++) {
        //         if(array[i] > array[j]) {
        //             int temp = array[i];
        //             array[i] = array[j];
        //             array[j] = temp;
        //         }
        //     }
        // }

        //풀이2
        Arrays.sort(array);

        int mid = array.length / 2;
        return array[mid];
    }
}
