package com.company;
import java.util.Arrays;
public class Main {



        public static void removeDuplicat(int arr[]) {
            Arrays.sort(arr);
            int j = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr[j++] = arr[i];
                }
            }

            arr[j++] = arr[arr.length- 1];

            for (int n = 0; n < j; n++) {
                System.out.print(arr[n] + " ");
            }
        }

        public static void main(String[] args) {

            int arr[] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
            System.out.println("array before removes all duplicates: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");}
            System.out.println("\narray after removes all duplicates: ");
            removeDuplicat(arr);

        }
    }





