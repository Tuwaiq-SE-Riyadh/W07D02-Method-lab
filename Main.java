package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        secondClass obj = new secondClass();
        int[] a = {20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
//        int[] a = {1, 2, 3, 4, 4, 5, 5};
        int[] test = obj.duplicateArray(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(test[i]);

        }

    }
}
