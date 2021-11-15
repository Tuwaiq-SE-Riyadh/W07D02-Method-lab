package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int array [] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        removesDuplicates(array);

    }
    public static void removesDuplicates(int [] arr){

        int[] newArray = new int[arr.length] ;
        int count = -1;
        int index = 0;

        for(int i=0; i<arr.length; i++){
            for (int j = 0; j <arr.length ; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
            }

            if(count == 0){
                newArray[index] = arr[i];
                index++;
            }
            System.out.println("index :" + i + "have dublict => "+ count);
            count = -1;
        }

        int[] finalArray = new int [index];
        for (int i = 0; i < index  ; i++) {

            finalArray[i] = newArray[i];

        }

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(finalArray));
    }
}


