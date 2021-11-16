package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" , ");

        }
        System.out.println("\n");

        removesAllDuplicate(arr);

    }
    public static void removesAllDuplicate(int[]arr){
        int [] temp = new int[arr.length];
        int j = 0;
        for (int i=0; i< arr.length-1; i++){
            for (int k = 1; k < arr.length; k++) {
                if (arr[i] == arr[k]){
                    temp[j++] = arr[i];
            }


            }
            }
        }
    }
