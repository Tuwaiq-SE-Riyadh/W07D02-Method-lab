package com.company;

import java.util.Arrays;

public class methods {

        public static int removeDuplicates(int a[], int n)
        {
            int[] temp = new int[n];
            int j = 0;
            for (int i=0; i<n-1; i++){
                if (a[i] != a[i+1]){
                    temp[j++] = a[i];
                }
            }
            temp[j++] = a[n-1];
            for (int i=0; i<j; i++){
                a[i] = temp[i];
            }
            return j;
        }

    public static void main(String[] args)
        {
            int a[] = {20,100,10,80,70,1,0,-1,2,10,15,15,15,15,300,7,6,2,18,19,21,9,0};
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print( a[i] +" , ");
            }
            System.out.println("");
            int n = a.length;
            int j=0;
            j = removeDuplicates(a, n);
            for (int i = 0; i < j; i++)
                System.out.print(a[i] +" , ");
        }
    }
