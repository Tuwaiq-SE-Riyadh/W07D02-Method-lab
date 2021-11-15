
package com.company;
import java.util.*;
class Remove {
    public static void main (String[] args) {
        int arr[] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        Arrays.sort(arr);
        int length = arr.length;
        length = removeDuplicate(arr, length);
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }

        public static int removeDuplicate(int arr[], int n){

            int[] result = new int[n];
            int j = 0;
            for (int i=0; i<n-1; i++){
                if (arr[i] != arr[i+1]){

                    result[j++] = arr[i];
                }
            }
            result[j++] = arr[n-1];

            for (int i=0; i<j; i++){
                arr[i] = result[i];
            }
            return j;
        }


    }