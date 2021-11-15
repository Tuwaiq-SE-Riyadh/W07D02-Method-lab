package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        // 10 - 2 - 0 are duplicate.

        int count = countTheDuplicates(arr);
        int [] newArr = new int [arr.length - count];
         returnNewArrWithoutDuplicates(arr,newArr);

        System.out.println("Arrays Before:" + Arrays.toString(arr));
        System.out.println("Arrays After :" + Arrays.toString(newArr));



    }

    public static int countTheDuplicates(int[] arr)
    {
        int counter = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    counter ++;
                }
            }
        }

        return counter;
    }

    private static void returnNewArrWithoutDuplicates(int[] arr , int [] newArr)
    {
        boolean isDuplicates = false ;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicates = true ;
                }
            }

            if(isDuplicates == true)
            {
                isDuplicates = false;

            }
            else {
                pushingToNewArray(newArr,arr[i]);
            }

        }


    }

    private static void pushingToNewArray(int[] newArr, int i)
    {
        for (int j = 0; j < newArr.length; j++)
        {
            if(newArr[j] == 0)
            {
                newArr[j] = i;
                return;
            }
        }
    }


}
