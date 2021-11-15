package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        System.out.println(Arrays.toString(numbers));
        int[] newNumbers = deleteDuplicates(numbers);
        System.out.println(Arrays.toString(newNumbers));

    }

    public static int[] deleteDuplicates(int[] arr){
        int count =0;
        int num =arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < num; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    num--;
                    if(j != arr.length-1) {
                        for (int k = j; k < arr.length - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                    }
                }
            }
        }
        int[] newArr = new int[arr.length-count];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
