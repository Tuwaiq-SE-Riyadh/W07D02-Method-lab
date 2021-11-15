package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 4, 2, 5, 5 , 2 , 6};

        int n = array.length;
        System.out.println("Array befor \n");

        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
        Arrays.sort(array);
        n = removeDuplicates(array, n);

        System.out.println("\nArray after ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }

    static int removeDuplicates(int array[], int n)
    {
        int[] temp = new int[n];


        int j = 0;
        for (int i=0; i<n-1; i++)

            if (array[i] != array[i+1])
                temp[j++] = array[i];

        temp[j++] = array[n-1];
        for (int i=0; i<j; i++)
            array[i] = temp[i];

        return j;
    }



}
