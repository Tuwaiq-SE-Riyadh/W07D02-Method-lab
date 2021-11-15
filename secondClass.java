package com.company;

import java.util.Arrays;

public class secondClass {

    public static int[] duplicateArray(int[] array, int size) {
        int[] tempArray = new int[size];
        int j = 0;
        int counter = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j] = array[i];
                j++;
                counter++;
            }
        }

        return tempArray;

    }
}
