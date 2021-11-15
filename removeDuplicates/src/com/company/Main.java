package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        Arrays.sort(array);
        int len = array.length;
        System.out.println("Array before calling remove duplicates method: ");

        for(int i = 0 ; i < len ; i++){
            System.out.println(array[i]+" ");
        }

        len = removeDuplicates(array, len);

        System.out.println("Array after calling remove duplicates method: ");

        for(int i = 0 ; i < len ; i++){
            System.out.println(array[i]+" ");
        }
    }

    public static int removeDuplicates(int a[], int n){

        int[] tempArray = new int[n];
        int j = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(a[i] != a[i+1]){
                tempArray[j++] = a[i];
            }
        }
        tempArray[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = tempArray[i];
        }
        return j;
    }
}
